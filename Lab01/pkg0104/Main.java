
package pkg0104;

public class Main {

    public static void main(String[] args) {
        int n = Input.getInt("Enter a four-digit number: ");
        
        boolean Increase = CheckSequence.checkIncrease(n);
        boolean Decrease = CheckSequence.checkDecrease(n);
        
        Output.print("The sequence is increasing - this is ", Increase);
        Output.print("The sequence is decreasing - this is ", Decrease);
              
    }
    
}
