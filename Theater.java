import java.util.ArrayList;
/**
 * Theater handles the theater that is selected for a specific
 * movie at a specific time. The theater holds information about
 * rows in the theater.
 *
 * @author Final 2 Crew
 * @version 5.8.22
 */
public class Theater 
{
    ArrayList<String> rowsTH1 = new ArrayList<String>();
    ArrayList<String> rowsTH2 = new ArrayList<String>();
    ArrayList<String> rowsTH3 = new ArrayList<String>();
    
    ArrayList<String> theaters = new ArrayList<String>();
    
    /**
     * Constructor for objects of class Theater
     */
    public Theater()
    {
        rowsTH1.add("A");
        rowsTH1.add("B");
        rowsTH1.add("C");
        rowsTH1.add("D");
        rowsTH1.add("E");
        rowsTH1.add("F");
        rowsTH1.add("G");
        
        rowsTH2.add("A");
        rowsTH2.add("B");
        rowsTH2.add("C");
        rowsTH2.add("D");
        rowsTH2.add("E");
        rowsTH2.add("F");
        
        rowsTH3.add("A");
        rowsTH3.add("B");
        rowsTH3.add("C");
        rowsTH3.add("D");
        rowsTH3.add("E");
    }

    /**
     * rowsAvailable() method stores information on rows available
     * in a specific theater based on a specific movie and time.
     *
     * @param  rows available per theater
     * @return    rows that still have seats available
     */
    public void rowsAvailable(String time)
    {
        if(time.equals("1:45pm")){
            theaters.addAll(rowsTH1);
            for(int i = 0; i < theaters.size(); i++){
            String theater = theaters.get(i);
            System.out.println("Rows Available: " + theater);
            }
        }
        else if(time.equals("4:30pm")){
            theaters.addAll(rowsTH2);
            for(int i = 0; i < theaters.size(); i++){
            String theater = theaters.get(i);
            System.out.println("Rows Available: " + theater);
            }
        }
        else if(time.equals("7:30pm")){
            theaters.addAll(rowsTH3);
            for(int i = 0; i < theaters.size(); i++){
            String theater = theaters.get(i);
            System.out.println("Rows Available: " + theater);
        }
        }
        else
        System.out.println("Couldn't find your theater, make sure you input the time correctly. Ex. \"4:30pm\"");
    }
    
    /**
     * selectRow() method allows for user to select a row in 
     * their specified theater.
     * 
     * @param  rows available per theater
     * @return    row that person selects to sit in
     */
    public void selectRow(Rows row)
    {
        System.out.println("You selected row: " + row);
    }
}
