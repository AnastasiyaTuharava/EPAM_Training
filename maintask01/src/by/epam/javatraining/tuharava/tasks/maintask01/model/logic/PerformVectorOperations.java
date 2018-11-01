
package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.Vector;

/**
 * @author Anastasiya Tuharava
 * @version 1.0
 * development date: 01/11/2018
 */
public class PerformVectorOperations {
    
    public static double findMaxElement (Vector vector) {
        double maxElement = vector.getVectorElement(1);
        
        for (double temp : vector.getVector()) {
            if (temp > maxElement) {
                maxElement = temp;
            }
        }
        
        return maxElement;  
    }
    
    public static double findMinElement (Vector vector) {
        double minElement = vector.getVectorElement(1);
        
        for (double temp : vector.getVector()) {
            if (temp < minElement) {
                minElement = temp;
            }
        }
        
        return minElement;  
    }
    
    public static double calcGeometricMean (Vector vector) {
        double geometricMean = 1;
        
        for (double temp : vector.getVector()) {
            geometricMean *= temp;
        }
        
        return Math.pow(geometricMean, (1 / (double) vector.getVectorLength()));
    }
    
    public static double calcArithmeticalMean (Vector vector) {
        double arithmeticalMean = 1;
        
        for (double temp : vector.getVector()) {

            arithmeticalMean += temp;
        }
        
        return arithmeticalMean/vector.getVectorLength();
    }
    
    public static boolean isOrderedAscending (Vector vector) {
        int size = vector.getVectorLength();
        boolean result = true;
  
        for (int i = 0; i < size - 1; i++) {
            if (vector.getVectorElement(i) >= vector.getVectorElement(i+1)) {
                result = false;
            }
        }
        
        return result;
    }
    
    public static boolean isOrderedDescending (Vector vector) {
        int size = vector.getVectorLength();
        boolean result = true;
  
        for (int i = 0; i < size - 1; i++) {
            if (vector.getVectorElement(i) <= vector.getVectorElement(i+1)) {
                result = false;
            }
        }
        
        return result;
    }
    
    public static int determineIndexOfFirstLocalMax (Vector vector) {
        int size = vector.getVectorLength();
        int index = -1;
  
        for (int i = 1; i < size - 1; i++) {
            if (vector.getVectorElement(i-1) < vector.getVectorElement(i) 
                    && vector.getVectorElement(i) > vector.getVectorElement(i+1)) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int determineIndexOfFirstLocalMin (Vector vector) {
        int size = vector.getVectorLength();
        int index = -1;
  
        for (int i = 1; i < size - 1; i++) {
            if (vector.getVectorElement(i-1) > vector.getVectorElement(i) 
                    && vector.getVectorElement(i) < vector.getVectorElement(i+1)) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int binaryIndexSearchElement (double element, Vector vector) {
        int left = 0;
        int right = vector.getVectorLength();

        while(left < right) {
            int mid = (left + right)/2; 
            if (vector.getVectorElement(mid) == element) {
                return mid;
            } 
            if (vector.getVectorElement(mid) > element) {
                right = mid;
            } else if(vector.getVectorElement(mid) < element) {
               left = mid + 1; 
              }
        }
        
        return -1;
    }
    
    public static int linearIndexSearchElement (double element, Vector vector) {
        int index = -1;
        
        for (int i = 0; i < vector.getVectorLength(); i++) {
            if (vector.getVectorElement(i) == element) {
                index = i;
            }
        }
    
        return index;
    }
    
    public static void reverseArrayElements (Vector vector) {
        
        int vectorLength = vector.getVectorLength();
        
        if (vectorLength <= 1) {
            return;
        }
        for (int i = 0; i < vectorLength / 2; i++) {
            double temp = vector.getVectorElement(i);

            vector.setVectorElement(i, vector.getVectorElement(vectorLength - 1 - i));
            vector.setVectorElement(vectorLength - 1 - i, temp);
        }
    }
    
    public static void sortArrayBubbleByDescending (Vector vector) {
        boolean isSorted = false;
        double temp;
        int vectorLength = vector.getVectorLength();
        
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < vectorLength-1; i++) {
                if(vector.getVectorElement(i) < vector.getVectorElement(i+1)){
                    isSorted = false;
 
                    temp = vector.getVectorElement(i);
                    vector.setVectorElement(i, vector.getVectorElement(i+1));
                    vector.setVectorElement(i+1, temp);
                }
            }
        }
    }
    
    public static void sortArrayInsertionByDescending (Vector vector) {
        int vectorLength = vector.getVectorLength();
        
        for (int i = 1; i < vectorLength; i++) {
            for (int j = i; j > 0 && vector.getVectorElement(j-1) < vector.getVectorElement(j); j--) {
                double temp = vector.getVectorElement(j);
                vector.setVectorElement(j, vector.getVectorElement(j-1));
                vector.setVectorElement(j-1, temp);
            }
        }
    }
    
    public static void sortSelectionByAscending (Vector vector){
        int min;
        int vectorLength = vector.getVectorLength();

        for (int i = 0; i < vectorLength-1; i++){
            min = i;
            for (int j = i+1; j < vectorLength; j++){
                if (vector.getVectorElement(j) < vector.getVectorElement(min))
                    min = j;
            }

            // Swap the values
            double temp = vector.getVectorElement(min);
            vector.setVectorElement(min, vector.getVectorElement(i));
            vector.setVectorElement(i, temp);
        }
    }
    
}


