
/**
 * Write a description of class ProductList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProductList
{
    // fields
    private Product[] listOfProducts;

    /**
     * Constructor for objects of class ProductList
     */
    public ProductList()
    {
        listOfProducts = new Product[5];
    }

    public void setListOfProducts(Product[] listOfProducts)
    {
        this.listOfProducts = listOfProducts;
    }
    public Product[] getListOfProducts()
    {
        return listOfProducts;
    }
    
    //Add a new product to the list
    public void addNewProToList(int proPosition)
    {
        Product newProduct = new Product();
        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        Scanner console = new Scanner(System.in);
        String name = "";
        String desc = "";
        double price = 0;
        int qtyOnHand = 0;
        int minOrderQty = 0;
        System.out.println("Please enter the name of the product: ");
        do {
            name = console.nextLine();
        }while (!checkProName(name));
        System.out.println("Please enter the description of the product: ");
        do {
            desc = console.nextLine();
        }while (!checkProDesc(desc));
        System.out.println("Please enter the unit price for a single item of the product: ");
        do {
           price = console.nextDouble();
        }while (!checkProPrice(price));
        qtyOnHand = randomNumber.generateNumber(0,10);
        System.out.println("Please enter the minimum quantity to be ordered: ");
        minOrderQty = console.nextInt();
        //Generate the new Product
        newProduct.setName(name);
        newProduct.setDesc(desc);
        newProduct.setPrice(price);
        newProduct.setQtyOnHand(qtyOnHand);
        newProduct.setMinOrderQty(minOrderQty);
        //Add this product to the list
        listOfProducts[proPosition] = newProduct;
    }
    
    //Check the product name
    public boolean checkProName(String name)
    {
        if (name.length() < 3 || name.length() > 25)
        {
            System.out.println("Name must be between 3 and 25 characters long!");
            return false;
        }
        for (Product p : listOfProducts)
        {
            if ((name.toLowerCase()).equals(p.getName().toLowerCase()))
            {
                System.out.println("Name cannot be repeated for two or more products!");
                return false;
            }
        }
        return true;
    }
    
    //Check the product description
    public boolean checkProDesc(String desc)
    {
        if (desc.length() < 1 || desc.length() > 50)
        {
            System.out.println("Description must be between 1 and 50 characters long!");
            return false;
        }
        else
        {
            return true;
        }
    }
    
    //Check the product price
    public boolean checkProPrice(double price)
    {
        if (price < 0)
        {
            System.out.println("Price must be over 0!");
            return false;
        }
        else
        {
            return true;
        }        
    }
}
