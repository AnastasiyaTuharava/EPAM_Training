
package pkg0107;

public class Change {
    
    public static void Change (int a, int b) {
        b += a;
        a = b - a;
	b -= a;	 
		
	System.out.println("Now a is " + a);
	System.out.println("Now b is "+ b);       
    }   
}
