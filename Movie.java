import java.util.ArrayList;
/**
 * Movie handles the movie that is selected from MovieCollection
 * to create a seatBooking with. In a complete version specific movies 
 * would be directly attached to specific times in order to find the theater
 * it would be playing in. But for this we just used a randomizer
 * to simulate.
 *
 * @author Final 2 Crew
 * @version 4.25.22
 */
public class Movie 
{
    ArrayList<String> times = new ArrayList<String>();
    
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {   
        times.add("1:45pm");
        times.add("4:30pm");
        times.add("7:30pm");
    }

    /**
     * availableTimes() method returns what it does and the times the selected movie is playing
     *
     * @param  times available for a specific movie
     * @return    what this method does and a random time of a movie playing
     */
    public String availableTimes()
    {
        String returnString = "This returns the times a movie is playing. Times: " + times;
        return returnString;
    }
    
    /**
     * selectTime() method allows the user to select a time they want to see the movie
     *
     * @param  times available for a specific movie
     * @return    what this method does and a random time of a movie playing
     */
    public void selectTime(TimeDate time)
    {
        System.out.println("You have chosen the time: " + time);
    }
}