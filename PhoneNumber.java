
/**
 * PhoneNumber class holds information on what a phone number
 * is and it allows for users to use their phone number to 
 * find information about their reservations.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class PhoneNumber 
{
    // instance variables - replace the example below with your own
    private Reservation reservation;

    /**
     * Constructor for objects of class PhoneNumber
     */
    public PhoneNumber()
    {
        // initialise instance variables
        
    }

    /**
     * getReservation() method allows the user to find their
     * reservation based on their phonenumber information
     * 
     * @param  reservations(seatbookings) & phonenumbers
     * @return    all reservations
     */
    public String getReservation(PhoneNumber number)
    {
        String reservation = "Your reservation";
        return "Ex: " + reservation;
    }
    
}
