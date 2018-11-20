
package by.epam.javatraining.tuharava.tasks.maintask01.model.exceptions;

/**
 * @author Anastasiya Tuharava
 * @version 2.0 development date: 01/11/2018
 */

public class IncorrectArrayIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException {

    public IncorrectArrayIndexOutOfBoundsException() {
    }

    public IncorrectArrayIndexOutOfBoundsException(int index) {
        super(index);
    }

    public IncorrectArrayIndexOutOfBoundsException(String s) {
        super(s);
    }
    
}
