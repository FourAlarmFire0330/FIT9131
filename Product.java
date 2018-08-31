
/**
 * Write a description of class Product here.
 * 
 * @Tianyang Zhang - 28484452
 * @version (a version number or a date)
 */
public class Product
{
    // fields
    private String name;
    private String desc;
    private String price;
    private int qtyOnHand;
    private int minOrderQty;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        name = "";
        desc = "";
        price = "";
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
    
    public void setMinOrderQty(int minOrderQty)
    {  
        this.minOrderQty = minOrderQty;    
    }
    public int getMinOrderQty()
    {
        return minOrderQty;
    }        
}
