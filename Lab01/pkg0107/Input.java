
package pkg0107;

import java.util.Scanner;

public class Input {
    public static int getInt (String str) {
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}