import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 * Movie handles the movies that are playing currently. In a
 * complete version specific movies would be directly attached 
 * to specific theaters. But for this we just used a randomizer
 * to simulate.
 *
 * @author Final 2 Crew
 * @version 4.25.22
 */
public class Movie extends Theater
{
    // instance variables - replace the example below with your own
    List<String> movies = new ArrayList<String>();
    List<String> times = new ArrayList<String>();
    
    private TimeDate timeDate;
    
    private String movie;
    private String time;
    
    Random rand = new Random();
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        movies.add("Guardians of the Galaxy");
        movies.add("The Avengers");
        movies.add("Batman");
        
        times.add("1:45pm");
        times.add("4:30pm");
        times.add("7:30pm");
    }

    /**
     * getTime() method returns what it does and a random
     * time that a movie could be playing.
     *
     * @param  times available in times arraylist
     * @return    what this method does and a random time of a movie playing
     */
    public String getTime()
    {
        int random = rand.nextInt(times.size());
        time = times.get(random);
        String returnString = "This returns the time of a movie playing. For example, " + time;
        return returnString;
    }
    
    /**
     * getMovie() method returns what it does and a random
     * movie that could be playing.
     *
     * @param  movies available in movies arraylist
     * @return    what this method does and a random movie playing
     */
    public String getMovie()
    {
        int random = rand.nextInt(movies.size());
        movie = movies.get(random);
        return "This returns the movie playing. For example, " + movie;
    }
}