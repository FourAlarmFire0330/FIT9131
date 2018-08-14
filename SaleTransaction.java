
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
        if (items[0] != null && items[1] != null && items[2] != null)
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
                System.out.println();
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
        int i = 1;
        System.out.println("These are the products from your Cart: ");
        for (Product p : items)
        {
            if (p == null)
                System.out.println();
            else
            {
                System.out.println("Added Item " + i);
                System.out.println("Name: " + p.getName());
                System.out.println("  Description: " + p.getDesc());
                System.out.println("  Quantity: " + p.getQtyOnHand());
                System.out.println("  Price: " + p.getPrice());
                System.out.println();
                i++;
            }
        }
    }
    
    //Remove items from the cart
    public void RemoveProFromCart()
    {
        if (items[0] == null && items[1] == null && items[2] == null)
        {
            System.out.println("There is no items in the Cart! ");
        }
        else
        {
            String rmOption = "";
            Scanner console = new Scanner(System.in);
            System.out.println("Please select from the following products which have been added to the cart: ");
            viewProFromCart();
            System.out.println("Please enter Added Item: (q for quiting the cart)");
            rmOption = console.nextLine();
            switch (rmOption)
            {
                case "1":
                    if (items[0] == null)
                        System.out.println("This item does not exist! ");
                    else {
                        items[0] = null;
                        System.out.println("Successfully removed Item 1!");
                    }
                    break;
                case "2":
                    if (items[1] == null)
                        System.out.println("This item does not exist! ");
                    else {
                        items[1] = null;
                        System.out.println("Successfully removed Item 2!");
                    }
                    break;
                case "3":
                    if (items[2] == null)
                        System.out.println("This item does not exist! ");
                    else {
                        items[2] = null;
                        System.out.println("Successfully removed Item 3!");
                    }
                    break;
                case "q":
                    System.out.println("quiting the cart!");
                    break;
                default:
                    System.out.println("No such item! ");
                    break;
            }
        }
    }
    
    //Check out your purchase
    public void checkOut()
    {
        if (items[0] == null && items[1] == null && items[2] == null)
        {
            System.out.println("There is no items in the Cart! ");
        }
        else
        {
            Scanner console = new Scanner(System.in);
            String goOnOption = "";
            System.out.println("These are the products from your Cart: ");
            for (Product p : items)
            {
                if (p == null)
                    System.out.println();
                else
                {
                    System.out.println("Name: " + p.getName());
                    System.out.println("  Description: " + p.getDesc());
                    System.out.println("  Quantity: " + p.getMinOrderQty());
                    System.out.println("  Price: " + p.getPrice());
                    System.out.println();
                }
            }
            System.out.println("Are you sure you want to check out? (Y/N)");
            goOnOption = console.nextLine();
            if (goOnOption.equals("Y") || goOnOption.equals("y"))
            {
                for (Product p : items)
                {
                    if (p == null)
                    {
                    }
                    else
                    {
                        double costForOneItem = Integer.parseInt(p.getMinOrderQty()) * Double.parseDouble(p.getPrice());
                        int leftQuantity = p.getQtyOnHand() - Integer.parseInt(p.getMinOrderQty());
                        p.setQtyOnHand(leftQuantity);
                        totalCost = totalCost + costForOneItem;
                        setTotalCost(totalCost);
                    }
                }
                System.out.println("The totalCost for your purchase is: " + getTotalCost());
                for (int i = 0; i < 3; i++)
                {
                    items[i] = null;
                }
                setTotalCost(0);
                System.out.println("Successfuly check out! See u next time~");                
            }
            else if (goOnOption.equals("N") || goOnOption.equals("n"))
            {
                System.out.println("Successfully cancelled! ");
            }
            else
            {
                System.out.println("Wrong Input! ");
            }
        }
    }
}
