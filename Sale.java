
/**
 * Write a description of class Sale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
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
    
    //Display the menu
    public static void Menu()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Welcome to the Simple Inventory Management System");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println();
        System.out.println("Please Select from the following options: ");
        System.out.println("Press 1 to Register a Product for Sale");
        System.out.println("Press 2 to Buy a Product to the Cart");
        System.out.println("Press 3 to Remove a Product from the Cart");
        System.out.println("Press 4 to View all Available Products");        
        System.out.println("Press 5 to Check out");
        System.out.println("Press 6 to Get Help");
        System.out.println("Press 7 to Exit");
        System.out.println();
        System.out.println("Please Enter your Choice: ");
    }
    
    
    //The entrance to the program
    public void entrance()
    {
        boolean keepRunning = true; 
        Scanner console = new Scanner(System.in);
        Product[] pro = new Product[5];
        String choice = "";
        int addProTimes = 0;
        int addToCartTimes = 0;
        
        while (keepRunning)
        {
            Menu();
            choice = console.nextLine();
            switch (choice)
            {
                case "1":
                    pro = prodList.addNewProToList(addProTimes);
                    addProTimes++;
                    break;
                case "2":
                    if (transaction.AddProToCart(addToCartTimes, pro))
					{
                    	addToCartTimes++;
						break;
					}
					else
                    	break;
                case "3":
                    transaction.RemoveProFromCart();
                    break;
                case "4":
                    prodList.viewAllPro();
                    break;
                case "5":
                    transaction.checkOut();
                    break;
                case "6":
                    System.out.println("6");
                    break;
                case "7":
                    System.out.println("System closed!");
                    System.exit(0);
                default:
                    System.out.println("There is no such a option! Please enter again~");
                    break;
            }
        }
    }
    //Allows the user to view a brief but descriptive expanation on how to use the system
    public void getHelp()
    {
        
    }
}
