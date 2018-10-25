
package by.epam.java0.tuharava.view;

public class Output {
    
    public static void print (int DragonHeads, int DragonEyes) {
        if (DragonHeads == 0 ) {
            System.out.println("Dragon isn't born yet!");
        }
        else {
            System.out.print("Dragon has " + DragonHeads + " heads");
            System.out.println(" and he has " + DragonEyes + " eyes!");
        }
    }
}
