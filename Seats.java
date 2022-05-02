
/**
 * This holds information on what makes up a seat
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seats
{
    // instance variables - replace the example below with your own
    private int seat [] = {1,2,3,4,5,6,7,8,9,10};

    /**
     * Constructor for objects of class Seats
     */
    public Seats()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleSeat()
    {
        int example = 0;
        for(int x = 0; x < seat.length; x++){
            example = seat[x];
        }
        return example;
    }
}
