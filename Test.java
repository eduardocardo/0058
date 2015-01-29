import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void mostrar()
    {
        ArrayList<Lot> otherLot = new ArrayList<>();
        Auction auction = new Auction();
        
        auction.enterLot("1");
        auction.enterLot("2");
        auction.enterLot("A");
        auction.enterLot("B");
        auction.enterLot("C");
        
        Person bb = new Person("bb");
        Person aa = new Person("aa");
        Person cc = new Person("cc");
        
        auction.makeABid(1, bb, 100);
        auction.makeABid(2, aa, 200);
        auction.makeABid(3, cc, 300);
        otherLot = auction.getUnsold() ;
        for(Lot lot : otherLot)
        {
            System.out.println(lot);
        }
        
    }
}
