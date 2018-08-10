
/**
 * Write a description of class ProductList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductList
{
    // fields
    private Product[] listOfProducts;

    /**
     * Constructor for objects of class ProductList
     */
    public ProductList()
    {
        listOfProducts = new Product[100];
    }

    public void setListOfProducts(Product[] listOfProducts)
    {
        this.listOfProducts = listOfProducts;
    }
    public Product[] getListOfProducts()
    {
        return listOfProducts;
    }
}
