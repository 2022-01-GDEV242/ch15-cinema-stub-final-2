import java.util.ArrayList;
/**
 * SeatBooking class is used to store information about seats
 * booked per showing. It uses movie, time, theater, rows and
 * seats. This creates the seatbooking for the reservation.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class SeatBooking
{
    ArrayList<SeatBooking> seatBookings = new ArrayList<SeatBooking>();
    
    /**
     * Constructor for objects of class SeatBooking
     */
    public SeatBooking()
    {
        // initialise instance variables
        
    }

    /**
     * seatBookings() method allows for the user to create a new seatBooking in a reservation
     *
     * @param  seatBookings array list
     * @return    all seatBookings created
     */
    public void seatBookings()
    {
        System.out.println("Current Bookings: " + seatBookings);
    }
    
    /**
     * createSeatBooking() method allows for the user to create a new seatBooking in a reservation
     *
     * @param  movie(from movie collection), time, theater, row, seat
     * @return    all selected variables together
     */
    public void createSeatbooking()
    {
        MovieCollection movies = new MovieCollection();
        Movie movie = new Movie();
        TimeDate time = new TimeDate();
        Theater theater = new Theater();
        Rows row = new Rows();
        Seats seat = new Seats();
        
        System.out.println("This creates a seat booking: " + " Movie: " + movie + " Time: " + time + " Theater: " + theater + " Row: " + row + " Seat: " + seat);
    }
}
