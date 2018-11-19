package by.epam.javatraining.tuharava.tasks.maintask01.model.entity;

//import java.util.Scanner;
import by.epam.javatraining.tuharava.tasks.maintask01.model.exceptions.IncorrectArrayIndexOutOfBoundsException;
import by.epam.javatraining.tuharava.tasks.maintask01.view.Output;
import java.util.Arrays;


/**
 * @author Anastasiya Tuharava
 * @version 2.0 development date: 01/11/2018
 */
public class FloatVector {

    public static final int DEFAULT_SIZE = 10;

    private static double[] floatVector ;

    public FloatVector() {
        floatVector = new double[DEFAULT_SIZE];
    }

    public FloatVector(double... array) {
        floatVector = array;
    }

    public FloatVector(int size) {
        if (size >= 0) {
            floatVector = new double[size];
        } else {
            floatVector = new double[0];
        }
    }

    public double[] getVector() {
        return floatVector;
    }

    public double getElement(int index) {
        checkIndex(index);
        return floatVector[index];
    }
    
    private void checkIndex(int index) {
        try {
            if (index > floatVector.length || index < 0)
            throw new IncorrectArrayIndexOutOfBoundsException();
        } catch (IncorrectArrayIndexOutOfBoundsException e) {
            Output.log("Index Out Of Bounds Exception" + e);
        }
    }

    public static int getVectorLength() {
        try {
            if (floatVector.length < 0)
            throw new IncorrectArrayIndexOutOfBoundsException();
        } catch (IncorrectArrayIndexOutOfBoundsException e) {
            Output.log("Index Out Of Bounds Exception" + e);
        }
        return floatVector.length;
    }

    public static void setFloatVector(double... array) {
        floatVector = array;
    }
    
    public void setElement(int index, double element) {
        checkIndex(index);
        floatVector[index] = element;
    }  

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder ();
        for (double temp : floatVector) {
            str.append(temp).append(" ");
        }
        return str.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if (obj == this) {
            return true;
        } else
            return false;
        }
}


