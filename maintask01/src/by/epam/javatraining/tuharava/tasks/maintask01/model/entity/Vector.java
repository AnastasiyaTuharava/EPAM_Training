
package by.epam.javatraining.tuharava.tasks.maintask01.model.entity;

import java.util.Scanner;

/**
 * @author Anastasiya Tuharava
 * @version 1.0
 * development date: 01/11/2018
 */
public class Vector {
    
    private static double [] vector;
    
    public Vector () {
    }

    public Vector (int size) {
        if(size < 0) {
            throw new NegativeArraySizeException();
        }
        vector = new double [size];
    }
    
    public double[] getVector() {
        return vector;
    }
    
    public double getVectorElement (int index) {
        if (index >= vector.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return vector[index];
    }
    
     public static int getVectorLength () {
        return vector.length;
    }
    
    public static void setVectorByRandom () {
        for (int i = 0; i < vector.length; i++) {
            vector [i] = (Math.random()*(2000+1)) - 1000;
        }
    }
    
    public static void setVectorByConsole () {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter the number: ");
            Scanner in = new Scanner(System.in);
            vector [i] = in.nextDouble();
        }
    }
    
    public void setVectorElement (int index, double element) {
        vector [index] = element;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (double temp : vector) {
            str += temp + "  ";
        }
        return str;
    }
    
}
