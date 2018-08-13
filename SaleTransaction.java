
/**
 * Write a description of class SaleTransaction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    public boolean AddProToCart(int cartNumber, int selectedPro)
    {
        ProductList proListObject = new ProductList();
        Product[] proList = new Product[5];
        proList = proListObject.getListOfProducts();
        
        if (proList[selectedPro].getQtyOnHand() < Integer.parseInt(proList[selectedPro].getMinOrderQty()))
        {
            System.out.println("There are not enough quantity to buy! Sorry about that~");
            return false;
        }
        else
        {
            items[cartNumber] = proList[selectedPro];
            System.out.println("Successfully added to the cart!");
            return true;
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
