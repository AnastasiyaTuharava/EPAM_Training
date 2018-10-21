
package pkg0103;

import java.lang.Math;

public class RingArea {
    
    public static double calcRingArea (double r1, double r2) {
        
        double ringArea = Math.PI * (r1*r1 - r2*r2);
                
        return ringArea;
    } 
}
