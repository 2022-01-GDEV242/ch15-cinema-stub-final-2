import java.util.ArrayList;
/**
 * TimeDate handles the time a specific movie is playing.
 * Based on the time selected for the movie in the movie class
 * the TimeDate class would then connect that time to a specific theater.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class TimeDate{
    ArrayList<String> theaters = new ArrayList<String>();
    
    /**
     * Constructor for objects of class TimeDate
     */
    public TimeDate()
    {
        theaters.add("Theater 1");
        theaters.add("Theater 2");
        theaters.add("Theater 3");
    }

    /**
     * availableTheaters() method allows the user to see all the
     * theaters playing the selected movie at the selected time.
     * 
     * @param  theaters available in theaters arraylist
     * @return    all theaters showing specific movie at specific time
     */
    public void availableTheaters()
    {
        System.out.println("Available Theaters for your movie: " + theaters);    
    }
    
    /**
     * selectTheater() method allows for user to get the theater
     * that their movie is playing in based on the movie they
     * picked at a specific time.
     * 
     * @param  theater selected based on movie and time
     * @return    selected theater
     */
    public void selectTheater(Theater theater)
    {
        //IF COMPLETED getTheater() would have if statements 
        //here to determine each theater based off specific 
        //movie and time
        System.out.println("Your movie is in theater: " + theater);    
    }
    
    
}
