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
public class Movie
{
    // instance variables - replace the example below with your own
    List<String> movies = new ArrayList<String>();
    Random rand = new Random();
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
    movies.add("Guardians of the Galaxy");
    movies.add("The Avengers");
    movies.add("Batman");
    }

    /**
     * getMovie() method returns what it does and a random
     * movie that could be playing.
     *
     * @param  movies available in movies arraylist
     * @return    random movie playing
     */
    public void getMovie()
    {
        int random = rand.nextInt(movies.size());
        String movie = movies.get(random);
        System.out.println("This returns the movie playing. For example, " + movie);
    }
}
