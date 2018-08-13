
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
    private String price;
    private int qtyOnHand;
    private String minOrderQty;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        name = "";
        desc = "";
        price = "";
        qtyOnHand = 0;
        minOrderQty = "";
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
    
    public void setPrice(String price)
    {  
        this.price = price;    
    }
    public String getPrice()
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
    
    public void setMinOrderQty(String minOrderQty)
    {  
        this.minOrderQty = minOrderQty;    
    }
    public String getMinOrderQty()
    {
        return minOrderQty;
    }
    
    
}
