
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
    public Product[] addNewProToList(int proPosition)
    {
        Product newProduct = new Product();
        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        Scanner console = new Scanner(System.in);
        String name = "";
        String desc = "";
        String price = "";
        int qtyOnHand = 0;
        String minOrderQty = "";
        if (proPosition > 4)
        {
            System.out.println("The System only allows a maximum of 5 products which can be registered! ");
        }
        else
        {
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
               price = console.nextLine();
            }while (!checkProPrice(price));
            qtyOnHand = randomNumber.generateNumber(0,10);
            System.out.println("Please enter the minimum quantity to be ordered: ");
            minOrderQty = console.nextLine();
            //Generate the new Product
            newProduct.setName(name);
            newProduct.setDesc(desc);
            newProduct.setPrice(price);
            newProduct.setQtyOnHand(qtyOnHand);
            newProduct.setMinOrderQty(minOrderQty);
            //Add this product to the list
            listOfProducts[proPosition] = newProduct;
            System.out.println("Successfully add the product!");
        }
        return listOfProducts;
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
            if (p == null)
            {
                return true;
            }
            
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
    public boolean checkProPrice(String price)
    {
        if (Double.parseDouble(price) <= 0)
        {
            System.out.println("Price must be over 0!");
            return false;
        }
        else
        {
            return true;
        }        
    }
    
    //View all Available Products
    public void viewAllPro()
    {
        System.out.println("These are all available Products: ");
        
        for (Product p : listOfProducts)
        {
            if (p == null)
            {
                System.out.println();
            }
            else
            {
                System.out.println("Name: " + p.getName());
                System.out.println("  Description: " + p.getDesc());
                System.out.println("  Quantity: " + p.getQtyOnHand());
                System.out.println("  Price: " + p.getPrice());
                System.out.println("  Min Order Quantity: " + p.getMinOrderQty());
                System.out.println();
            }
        }
    }
}
