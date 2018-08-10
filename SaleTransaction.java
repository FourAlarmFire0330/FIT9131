
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
        items = new Product[100];
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
}
