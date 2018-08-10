
/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product
{
    // fields
    private String name;
    private String desc;
    private double price;
    private int qtyOnHand;
    private int minOrderQty;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        name = "";
        desc = "";
        price = 0;
        qtyOnHand = 0;
        minOrderQty = 0;
    }
    
    public void setName(String name)
    {  
        this.name = name;    
    }
    public String getName()
    {
        return name;
    }
    
    public void setDesc(String desc)
    {  
        this.desc = desc;    
    }
    public String getDesc()
    {
        return desc;
    }
    
    public void setPrice(double price)
    {  
        this.price = price;    
    }
    public double getPrice()
    {
        return price;
    }
    
    public void setQtyOnHand(int qtyOnHand)
    {  
        this.qtyOnHand = qtyOnHand;    
    }
    public int getQtyOnHand()
    {
        return qtyOnHand;
    }
    
    public void setMinOrderQty(int minOrderQty)
    {  
        this.minOrderQty = minOrderQty;    
    }
    public int getMinOrderQty()
    {
        return minOrderQty;
    }
    
    
}
