import java.util.ArrayList;
/**
 * Rows holds information on seats in a specific row based on 
 * what theater a movie is playing in at a specific time.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class Rows
{
    ArrayList<Integer> seats = new ArrayList<Integer>();
    
    /**
     * Constructor for objects of class Rows
     */
    public Rows()
    {
        
    }

    /**
     * seatsAvailable() method holds information about available
     * seats in a specific theater and a specific row of that theater.
     *
     * @param  theater and row selected
     * @return    seats available in that theater and row
     */
    public void seatsAvailable()
    {
        for(int i = 1; i < 21; i++){
            seats.add(i);
        }
        System.out.println("Seats Available for Row Selected: " + seats);
    }
    
    /**
     * selectSeat() method allows user to select a seat in a 
     * specific theater and row
     *
     * @param  theater and row selected
     * @return    seat selected in that theater and row
     */
    public void selectSeat(Seats seat)
    {
        System.out.println("You've selected seat: " + seat);
    }
}
