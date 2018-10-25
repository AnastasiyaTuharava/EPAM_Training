
package by.epam.java0.tuharava.util;

import java.util.Scanner;

public class Input {
    
    private static int dragonAge;
    
    public static int getAge () {
        return dragonAge=Input.setAge();
    }
    
    private static int setAge () {
        System.out.println("Enter Dragon Age: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}

