
/**
 * Write a description of class RandomNumberGenerator here.
 * 
 * @author (your name) 
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
}
