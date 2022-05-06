import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieCollection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieCollection
{
    List<String> movies = new ArrayList<String>();
 
    /**
     * Constructor for objects of class MovieCollection
     */
    public MovieCollection()
    {
        movies.add("Guardians of the Galaxy");
        movies.add("The Avengers");
        movies.add("Batman");
    }

    public void moviesAvailable()
    {
    System.out.println("Movies Available: " + movies);
    }
    
    public void selectMovie(String movie)
    {
        
        System.out.println("Movie Selected: " + movie);
    }
}
