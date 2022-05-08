import java.util.ArrayList;
import java.util.Random;
/**
 * This holds information on what makes each individual seat
 * per row and theater.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class Seats
{
    ArrayList<Integer> seats = new ArrayList<Integer>();
    Random rand = new Random();
    /**
     * Constructor for objects of class Seats
     */
    public Seats()
    {
        // initialise instance variables
        
    }

    /**
     * sampleSeat() method is used to simulate a seat selection
     *
     * @param  seats available in a specific row of a 
     * specific theater
     * @return    seat selected at random
     */
    public String sampleSeat()
    {
        for(int i = 1; i < 21; i++){
            seats.add(i);
        }
        return "Seat: " + seats.get(rand.nextInt(seats.size()));
    }
}
