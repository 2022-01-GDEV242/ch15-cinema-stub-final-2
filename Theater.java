import java.util.ArrayList;
/**
 * Theater handles the theaters that are available. In a
 * complete version specific theaters would be directly attached 
 * to specific movies and times. 
 *
 * @author Final 2 Crew
 * @version 4.25.22
 */
public class Theater
{
    private ArrayList<Row> rows;
    /**
     * Constructor for the Theater class
     * @param row The number of rows in this theater (This number will populate the ArrayList of rows)
     * @param seats The number of seats per row (This number will populate the seats in the rows)
     */
    public Theater(int row, int seats)
    {
        
    }
    
    /**
     * Returns the rows in the threatre
     */
    public ArrayList<Row> getRows(int rowNumber)
    {
        return rows;
    }
}
