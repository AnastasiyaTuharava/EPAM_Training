
package pkg0104;

public class Sequence {
    
    public static boolean Increase(int n){
        int n4 = (int) n%10;
        n /= 10;
        int n3 = (int) n%10;
        n /= 10;
        int n2 = (int) n%10;
        n /= 10;
        int n1 = (int) n%10;
        return (n1 < n2) && (n2 < n3) && (n3 < n4);
    }
    
    public static boolean Decrease(int n){
        int n4 = (int) n%10;
        n /= 10;
        int n3 = (int) n%10;
        n /= 10;
        int n2 = (int) n%10;
        n /= 10;
        int n1 = (int) n%10;
        return (n1 > n2) && (n2 > n3) && (n3 > n4);
    }
    
}
