import java.util.ArrayList;
/**
 * SeatBooking class is used to store information about seats
 * booked per showing. It uses movie, time, theater, rows and
 * seats. This creates the seatbooking for the reservation.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public void createSeatbooking(MovieCollection movie, TimeDate time, Theater theater, Rows row, Seats seat)
    {
        System.out.println("This holds all created reservations.");
    }
}
