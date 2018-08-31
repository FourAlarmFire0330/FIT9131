
/**
 * Write a description of class RandomNumberGenerator here.
 * 
 * @Tianyang Zhang - 28484452 
 * @version (a version number or a date)
 */
public class RandomNumberGenerator
{
    // fields
    private int minimumValue;
    private int maximumValue;

    /**
     * Constructor for objects of class RandomNumberGenerator
     */
    public RandomNumberGenerator()
    {
        minimumValue = 0;
        maximumValue = 0;
    }
    
    public void setMinimumValue(int minimumValue)
    {
        this.minimumValue = minimumValue;
    }
    public int getMinimumValue()
    {
        return minimumValue;
    }
    
    public void setMaximumValue(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }
    public int getMaximumValue()
    {
        return maximumValue;
    }
    
    //Generate the randomNumber within a range
    public int generateNumber(int minimumValue, int maximumValue)
    {        
        int randomNumber = minimumValue + (int)(Math.random() * (maximumValue - minimumValue));
        return randomNumber;
    } 
}
