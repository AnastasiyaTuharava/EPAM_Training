
package pkg0102;

public class Check {
    public static boolean checkEquality (double a, double b, double c) {
        return (a == b) && (b == c);
    }
    public static boolean checkinequality (double a, double b, double c) {
        return (a != b) && (b != c) && (c != a);
    }
}
