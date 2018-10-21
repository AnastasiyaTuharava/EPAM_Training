
package pkg0102;

public class Main {

    public static void main(String[] args) {
        double a = Input.getDouble("Enter a: ");
        double b = Input.getDouble("Enter b: ");
        double c = Input.getDouble("Enter c: ");
        
        boolean equalityCheck = Check.checkEquality(a,b,c);
        boolean inequalityCheck = Check.checkinequality(a,b,c);
        
        Output.print("Three digits are the same is ", equalityCheck);
        Output.print("Three numbers are different is ", inequalityCheck);
    }
}

