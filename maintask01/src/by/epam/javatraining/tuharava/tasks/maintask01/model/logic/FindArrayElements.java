
package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.FloatVector;

/**
 * @author Anastasiya Tuharava
 * @version 2.0
 * development date: 01/11/2018
 */
public class FindArrayElements {
    
    public static double findMaxElement (FloatVector vector) {
        double maxElement = Double.MIN_VALUE;
        
        for (double temp : vector.getVector()) {
            if (temp > maxElement) {
                maxElement = temp;
            }
        }
        
        return maxElement;  
    }
    
    public static double findMinElement (FloatVector vector) {
        double minElement = Double.MAX_VALUE;
        
        for (double temp : vector.getVector()) {
            if (temp < minElement) {
                minElement = temp;
            }
        }
        
        return minElement;  
    }
    
    public static int determineIndexOfFirstLocalMax (FloatVector vector) {
        int size = vector.getVectorLength()-1;
        int index = -1;
  
        for (int i = 1; i < size; i++) {
            if (vector.getElement(i-1) < vector.getElement(i) 
                    && vector.getElement(i) > vector.getElement(i+1)) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int determineIndexOfFirstLocalMin (FloatVector vector) {
        int size = vector.getVectorLength()-1;
        int index = -1;
  
        for (int i = 1; i < size; i++) {
            if (vector.getElement(i-1) > vector.getElement(i) 
                    && vector.getElement(i) < vector.getElement(i+1)) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int binaryIndexSearchElement (double element, FloatVector vector) {
        int left = 0;
        int right = vector.getVectorLength();

        while(left < right) {
            int mid = (left + right)/2; 
            if (vector.getElement(mid) == element) {
                return mid;
            } 
            if (vector.getElement(mid) > element) {
                right = mid;
            } else if(vector.getElement(mid) < element) {
               left = mid + 1; 
              }
        }
        
        return -1;
    }
    
    public static int linearIndexSearchElement (double element, FloatVector vector) {
        int index = -1;
        
        for (int i = 0; i < vector.getVectorLength(); i++) {
            if (vector.getElement(i) == element) {
                index = i;
            }
        }
    
        return index;
    }
    
}
