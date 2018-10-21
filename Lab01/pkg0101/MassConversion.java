
package pkg0101;

public class MassConversion {
    private static final int grInKg = 1000;
    private static final int mgInKg = 1000000;
    private static final int kgInTn = 1000;
    
    public static double ConvertToGrams (double a) {
        return a*grInKg;
    }
    public static double ConvertToMilligrams (double a) {
        return a*mgInKg;
    }
    public static double ConvertToTons (double a) {
        return a/kgInTn;
    }
}
