import java.util.ArrayList;
/**
 * Write a description of class Rows here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Row
{
    private ArrayList<Seat> seats;
    private int row;
    /**
     * Constructor for objects of class Rows
     * @param seats The number of seats in a row (will populate the ArrayList with Seat objects)
     * @param rowNumber The row's number
     */
    public Row(int rowNumber, int seats)
    {
        
    }
    
    /**
     * Returns the row number of the selected row
     * @return The row number
     */
    public int getRow()
    {
        return 0;
    }
    
    /**
     * Returns an ArrayList of the requested row
     * @param row The selected row number 
     */
    public ArrayList<Seat> getSeats(int row)
    {
        return seats;
    }
}
