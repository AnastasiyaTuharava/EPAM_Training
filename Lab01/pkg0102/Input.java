
package pkg0102;

import java.util.Scanner;

public class Input {
    public static double getDouble (String str) {
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}
