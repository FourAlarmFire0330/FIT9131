
/**
 * Write a description of class SaleTransaction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SaleTransaction
{
    // fields
    private int saleCode;
    private Product[] items;
    private double totalCost;

    /**
     * Constructor for objects of class SaleTransaction
     */
    public SaleTransaction()
    {
        saleCode = 0;
        items = new Product[3];
        totalCost = 0;
    }
    
    public void setSaleCode(int saleCode)
    {
        this.saleCode = saleCode;
    }
    public int getSaleCode()
    {
        return saleCode;
    }
    
    public void setItems(Product[] items)
    {
        this.items = items;
    }
    public Product[] getItems()
    {
        return items;
    }
    
    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }
    public double getTotalCost()
    {
        return totalCost;
    }
    
    //Add the selected item to the cart
    public boolean AddProToCart(int cartNumber, Product[] pro)
    {
        if (items[2] != null)
        {
            System.out.println("Sorry, a user can purchase a maximum of THREE items only! ");
            return false;
        }
        if (pro[0] == null)
        {
            System.out.println("There is no products on sale! ");
            return false;
        }
        Scanner console = new Scanner(System.in);
        String options = "";
        boolean keepBuying = true;
        int i = 1;
        System.out.println("Please select from the following products which are available: ");
        for (Product p : pro)
        {
            if (p == null)
            {
                break;
            }
            else
            {
                System.out.println("Select Product " + i);
                System.out.println("Name: " + p.getName());
                System.out.println("  Description: " + p.getDesc());
                System.out.println("  Quantity: " + p.getQtyOnHand());
                System.out.println("  Price: " + p.getPrice());
                System.out.println("  Min Order Quantity: " + p.getMinOrderQty());
                System.out.println();
                i++;
            }
        }
        while(keepBuying)
        {
            System.out.println("Please enter selected Product: (q for quit purchasing) ");
            options = console.nextLine();
            if (!(options.equals("q")))
            {
                if (pro[Integer.parseInt(options) - 1] == null)
                {
                    System.out.println("Only products added can be purchased! ");
                }
                else if (pro[Integer.parseInt(options) - 1].getQtyOnHand() 
                         < Integer.parseInt(pro[Integer.parseInt(options) - 1].getMinOrderQty()))
                {
                    System.out.println("Not enough quantity! ");
                }
                else
                {
                    items[cartNumber] = pro[Integer.parseInt(options) - 1];
                    System.out.println("Successfully added to the Cart! ");
                    return true;
                }
            }
            else
            {
                keepBuying = false;
            }
        }
		return keepBuying;
    }
    
    //view the Cart
    public void viewProFromCart()
    {
        System.out.println("These are the products from your Cart: ");
        for (Product p : items)
        {
            if (p == null)
            {
                break;
            }
            else
            {
                System.out.println("Name: " + p.getName());
                System.out.println("  Description: " + p.getDesc());
                System.out.println("  Quantity: " + p.getQtyOnHand());
                System.out.println("  Price: " + p.getPrice());
                System.out.println();                
            }
        }
    }
    
    //Remove items from the cart
    public boolean RemoveProFromCart(int cartNumber)
    {
        items[cartNumber] = null;
        System.out.println("Successfully removed from the cart!");
        return true;
    }
}
