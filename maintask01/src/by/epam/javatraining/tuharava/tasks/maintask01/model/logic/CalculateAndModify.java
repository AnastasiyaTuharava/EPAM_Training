
package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.FloatVector;
import by.epam.javatraining.tuharava.tasks.maintask01.model.exceptions.ErrorNullPointerException;
import by.epam.javatraining.tuharava.tasks.maintask01.view.Output;

/**
 * @author Anastasiya Tuharava
 * @version 2.0
 * development date: 01/11/2018
 */
public class CalculateAndModify {
    
    public static double calcGeometricMean (FloatVector vector) {
        double comp = 1;
        double geometricMean=-1; // If it is impossible to calculate
        
        for (double temp : vector.getVector()) {
            comp *= temp;
        }
        try {
            geometricMean = Math.pow(comp, (1.0 / vector.getVectorLength()));  
            throw new ErrorNullPointerException();
        }
        catch (ErrorNullPointerException e) {
            Output.log("Null Pointer Exception" + e);
        }
        return geometricMean;
    }
    
    public static double calcArithmeticalMean (FloatVector vector) {
        double arithmeticalMean = 1;
        
        for (double temp : vector.getVector()) {

            arithmeticalMean += temp;
        }
        
        return arithmeticalMean/vector.getVectorLength();
    }
    
    public static boolean isOrderedAscending (FloatVector vector) {
        int size = vector.getVectorLength();
        boolean result = true;
  
        for (int i = 0; i < size - 1; i++) {
            if (vector.getElement(i) >= vector.getElement(i+1)) {
                result = false;
            }
        }
        
        return result;
    }
    
    public static boolean isOrderedDescending (FloatVector vector) {
        int size = vector.getVectorLength();
        boolean result = true;
  
        for (int i = 0; i < size - 1; i++) {
            if (vector.getElement(i) <= vector.getElement(i+1)) {
                result = false;
            }
        }
        
        return result;
    }
    
    
    
    public static void reverseArrayElements (FloatVector vector) {
        
        int vectorLength = vector.getVectorLength();
        
        if (vectorLength <= 1) {
            return;
        }
        for (int i = 0; i < vectorLength / 2; i++) {
            double temp = vector.getElement(i);

            vector.setElement(i, vector.getElement(vectorLength - 1 - i));
            vector.setElement(vectorLength - 1 - i, temp);
        }
    }
    
}


