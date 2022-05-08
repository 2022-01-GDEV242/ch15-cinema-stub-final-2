import java.util.ArrayList;
/**
 * Reservation holds information about phonenumber and seatbooking.
 * This connects the two together to hold information for the
 * customers.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class Reservation 
{
    ArrayList<String> reservations = new ArrayList<String>();

    /**
     * Constructor for objects of class Reservation
     */
    public Reservation()
    {
        // initialise instance variables
        reservations.add("example reservation");
    }

    /**
     * makeReservation() method allows user to create new booking
     * and attach their phone number to it.
     *
     * @param  reservations(seatbookings) & phonenumbers
     * @return    new reservation
     */
    public void makeReservation(int number)
    {
        //create new seatbooking when reservation is created
        SeatBooking seatbooking = new SeatBooking();
        //create a new phonenumber when reservation is created
        //not used in our simulation
        PhoneNumber phone = new PhoneNumber();
        
        SeatBooking booking = seatbooking;
        for(int i = 1; i < reservations.size(); i++){
            reservations.add("Created Reservation: " + i + " booking " + booking + " attached to # " + number);;
        } 
    }
    
    /**
     * allReservations() method holds information on all 
     * reservations created.
     *
     * @param  reservations(seatbookings) & phonenumbers
     * @return    all reservations
     */
    public void allReservations()
    {
        System.out.println("Reservations: " + reservations);
    }
    
    /**
     * getReservation() method holds information on all 
     * reservations created. Uses seatbooking info attached 
     * to reservation in order to find booking.
     *
     * @param  reservations(seatbookings) and phoneNumbers
     * @return    all reservations
     */
    public String getReservation(SeatBooking seatbooking){
        String reservation = "Your reservation";
        return "Ex: " + reservation;
    }
}
