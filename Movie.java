import java.util.ArrayList;

/**
 * Movie handles the movies that are playing currently. In a
 * complete version specific movies would be directly attached 
 * to specific theaters. But for this we just used a randomizer
 * to simulate.
 *
 * @author Final 2 Crew
 * @version 4.25.22
 */
public class Movie
{
    private Theater theater;
    private String name;
    private TimeDate timeDate;
    /**
     * Constructor for objects of class Movie
     * @param theater The theater this movie is playing in
     */
    public Movie(Theater theater)
    {
        
    }
    
    /**
     * Returns the name of the Movie
     * movie that could be playing.
     */
    public String getMovieName()
    {
        return name;
    }
    
    /**
     * Returns the date and time of the Movie as a String object
     * @return the date and time of the 
     */
    public String getTimeDate()
    {
        return timeDate.getTimeString();
    }
}