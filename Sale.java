
/**
 * Write a description of class Sale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sale
{
    // fields
    private ProductList prodList;
    private SaleTransaction transaction;

    /**
     * Constructor for objects of class Sale
     */
    public Sale()
    {
        prodList = new ProductList();
        transaction = new SaleTransaction();
    }
    
    public void setProdList(ProductList prodList)
    {
        this.prodList = prodList;
    }
    public ProductList getProdList()
    {
        return prodList;
    }
    
    public void setTransaction(SaleTransaction transaction)
    {
        this.transaction = transaction;
    }
    public SaleTransaction getSaleTransaction()
    {
        return transaction;
    }
}
