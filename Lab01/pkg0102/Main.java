
package pkg0102;

/* Algorithm reference
https://drive.google.com/file/d/1bfkgzfXqLQrNsTKOi6g3nPnA7Q4EnIxU/view?usp=sharing
*/

public class Main {

    public static void main(String[] args) {
        double a = 10.5, b = 3.2, c = 10.5;
        
        System.out.println("Three digits are the same is " + Check.TheSame(a,b,c));
        System.out.println("Three numbers are different is " + Check.Different(a,b,c));
    }
}
