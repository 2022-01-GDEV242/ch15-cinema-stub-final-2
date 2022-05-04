
/**
 * Write a description of class CinemaBookingSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaBookingSystem
{
    private MovieCollection movieColletion;
    private 
    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem()
    {
         
    }
    
    /**
     * Takes the customer's phone number for the reservation
     * @param phoneNumber The customer's phone nubmer
     */
    public void takeReservation(int phoneNumber)
    {
        Reservation.setPhoneNumber(phoneNumber);
    }
}
