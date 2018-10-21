
package pkg0107;

public class Swap {
    
       
    public static void swapValues(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        
        Output.print("Now a is ", a);
        Output.print("Now b is ", b);   
    }   
}
