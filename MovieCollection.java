import java.util.ArrayList;
/**
 * MovieCollection handles the movies that are playing. In a
 * complete version specific movies would be directly attached 
 * to specific times which would then give us the theater. 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieCollection
{
    ArrayList<String> movies = new ArrayList<String>();
 
    /**
     * Constructor for objects of class MovieCollection
     */
    public MovieCollection()
    {
        movies.add("Guardians of the Galaxy");
        movies.add("The Avengers");
        movies.add("Batman");
    }

    /**
     * moviesAvailable() method returns what movies are playing
     *
     * @param  movies available in movies list
     * @return    movies available
     */
    public void moviesAvailable()
    {
    System.out.println("Movies Available: " + movies);
    }
    
    /**
     * addMovieAvailable() method returns what movies are playing and the movie added
     *
     * @param  movies available in the movies list
     * @return    movies available with new movie added
     */
    public void addMovieAvailable(String movie)
    {
        movies.add(movie);
        System.out.println("Added " + movie + " to available movies: " + movies);
    }
    
    /**
     * selectMovie() method allows the user to select a movie that a customer wants to see
     *
     * @param  movies available
     * @return    movie selected and in complete version would also give available times
     */
    public void selectMovie(Movie movie)
    {
        System.out.println("Movie Selected: " + movie);
    }
}
