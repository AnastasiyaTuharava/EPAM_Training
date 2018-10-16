
package pkg0102;

public class Check {
    public static boolean TheSame (double a, double b, double c) {
        return (a == b) && (b == c);
    }
    public static boolean Different (double a, double b, double c) {
        return (a != b) && (b != c) && (c != a);
    }
}
