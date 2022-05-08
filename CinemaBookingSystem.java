import java.util.Scanner;
/**
 * CinemaBookingSystem is our main class that runs the entire
 * system. It allows the user to create a new reservation,
 * search for reservation via phone number or seatbooking info 
 * and it allows user to see all reservations currently made.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class CinemaBookingSystem
{
    public static void main(String[]args){
        //ask for phone number to create Cinema Booking
        Scanner k = new Scanner(System.in);
        System.out.println("To create Reservation enter phone number:");
        int number = k.nextInt();
        System.out.println("You can now create your seat booking:");
        //create new reservation with the phone number inputed
        Reservation reservation = new Reservation();
        reservation.makeReservation(number);
    }
    
    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem()
    {
        // initialise instance variables
        
    
    }
    
    /**
     * createReservation() method allows user to create new 
     * rservation and attach their phone number to it.
     *
     * @param  reservations(seatbookings) & phonenumbers
     * @return    new reservation
     */
    public void createReservation()
    {
        //ask for phone number to create Cinema Booking
        Scanner k = new Scanner(System.in);
        System.out.println("To create Reservation enter phone number:");
        int number = k.nextInt();
        System.out.println("You can now create your seat booking:");
        //create new reservation with the phone number inputed
        Reservation reservation = new Reservation();
        reservation.makeReservation(number);
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
        Reservation reservation = new Reservation();
        reservation.allReservations();
    }
    
    /**
     * getReservationWithBooking() method allows the user to
     * find information on their reservation with their 
     * booking information.
     *
     * @param  reservations(seatbookings)
     * @return    reservation user is looking for
     */
    public void getReservationWithBooking(SeatBooking booking){
        Reservation reservation = new Reservation();
        reservation.getReservation(booking);
    }
    
    /**
     * getReservationWithNumber() method allows the user to
     * find information on their reservation with their 
     * phone number.
     *
     * @param  reservations(phone numbers)
     * @return    reservation user is looking for
     */
    public void getReservationWithNumber(PhoneNumber number){
        PhoneNumber phone = new PhoneNumber();
        phone.getReservation(number);
    }
}
