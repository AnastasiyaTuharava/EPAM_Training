
package pkg0103;

public class Main {

    public static void main(String[] args) {
        double r1 = Input.getDouble("Enter r1: ");
        double r2 = Input.getDouble("Enter r2: ");
        
        double ringArea = RingArea.calcRingArea(r1, r2);
        
        Output.print("Ring Area is ", ringArea);
        
    } 
}
