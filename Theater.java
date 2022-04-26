import java.util.ArrayList;
import java.util.Random;
import java.util.List;
/**
 * Theater handles the theaters that are available. In a
 * complete version specific theaters would be directly attached 
 * to specific movies and times. But for this we just used a 
 * randomizer to simulate a theater with a random movie at a random time.
 *
 * @author Final 2 Crew
 * @version 4.25.22
 */
public class Theater
{
    List<String> theaters = new ArrayList<String>();
    List<String> movies = new ArrayList<String>();
    List<String> times = new ArrayList<String>();

    private String theater;
    private String movie;
    private String time;
    
    Random rand = new Random();
    /**
     * Available Theaters, Movies and Times
     */
    public Theater()
    {
        theaters.add("Theater 1");
        theaters.add("Theater 2");
        theaters.add("Theater 3");
        
        movies.add("Guardians of the Galaxy");
        movies.add("The Avengers");
        movies.add("Batman");
        
        times.add("1:45pm");
        times.add("4:30pm");
        times.add("7:30pm");
        
    }

    /**
     * getTheater() method returns what it does and a random
     * theater that could be playing.
     *
     * @param  theaters available in theaters arraylist
     * @return    what this method does and a random theater, time of movie and movie
     */
    public String getTheater()
    {
        int random = rand.nextInt(theaters.size());
        theater = theaters.get(random);
        return "This returns the Theater that the movie is being played in, for example: " + theater;
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
     * randomShowing() method returns what it does and a random
     * movie that is available at a random time and in a random theater.
     *
     * @param  times available in times arraylist, movies available in movies arraylist and theaters available in theaters arraylist
     * @return    what this method does and a random movie at a random time in a random theater
     */
    public String randomShowing()
    {
        int randomTheater = rand.nextInt(theaters.size());
        theater = theaters.get(randomTheater);
        int randomMovie = rand.nextInt(movies.size());
        movie = movies.get(randomMovie);
        int randomTime = rand.nextInt(times.size());
        time = times.get(randomTime);
        
        return "Returns Random Available Showing:" + "   Ex. " + "The movie " + movie + " is available at " + time + " in " + theater;
    }
}
