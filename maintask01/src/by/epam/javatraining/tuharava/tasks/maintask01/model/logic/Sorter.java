package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.FloatVector;
import java.util.Arrays;

/**
 * @author Anastasiya Tuharava
 * @version 2.0 development date: 01/11/2018
 */
public class Sorter {

    public static void sortBubbleByDescending(FloatVector vector) {
        boolean isSorted = false;
        double temp;
        int vectorLength = vector.getVectorLength();

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vectorLength - 1; i++) {
                if (vector.getElement(i) < vector.getElement(i + 1)) {
                    isSorted = false;

                    temp = vector.getElement(i);
                    vector.setElement(i, vector.getElement(i + 1));
                    vector.setElement(i + 1, temp);
                }
            }
        }
    }

    public static void sortInsertionByDescending(FloatVector vector) {
        int vectorLength = vector.getVectorLength();

        for (int i = 1; i < vectorLength; i++) {
            for (int j = i; j > 0 && vector.getElement(j - 1) < vector.getElement(j); j--) {
                double temp = vector.getElement(j);
                vector.setElement(j, vector.getElement(j - 1));
                vector.setElement(j - 1, temp);
            }
        }
    }

    public static void sortSelectionByAscending(FloatVector vector) {
        int min;
        int vectorLength = vector.getVectorLength();

        for (int i = 0; i < vectorLength - 1; i++) {
            min = i;
            for (int j = i + 1; j < vectorLength; j++) {
                if (vector.getElement(j) < vector.getElement(min)) {
                    min = j;
                }
            }

            // Swap the values
            double temp = vector.getElement(min);
            vector.setElement(min, vector.getElement(i));
            vector.setElement(i, temp);
        }
    }
    
    private static double[] merge(double[] array1, double[] array2) {
        int length1 = array1.length, length2 = array2.length;
        int a = 0, b = 0;
        int len = length1 + length2; // a, b - счетчики в массивах
        double[] result = new double[len];

        for (int i = 0; i < len; i++) {
            if (b < length2 && a < length1) {
                if (array1[a] > array2[b]) result[i] = array2[b++];
                else result[i] = array1[a++];
            } else if (b < length2) {
                result[i] = array2[b++];
            } else {
                result[i] = array1[a++];
            }
        }

        return result;
    }


    private static double[] mergeSortTemp(double[] array) {
        int length = array.length;
        if (length < 2) return array;
        int middle = length / 2;
        return merge(mergeSortTemp(Arrays.copyOfRange(array, 0, middle)),
                mergeSortTemp(Arrays.copyOfRange(array, middle, length)));
    }
    
    public static void sortMergeByAscending(FloatVector vector)  {
        vector.setFloatVector(mergeSortTemp(vector.getVector()));
    }
    
    private static int doQuickSort(double[] array, int beginIndex, int endIndex) {
        double index = array[endIndex];
        int i = (beginIndex - 1);

        for (int j = beginIndex; j < endIndex; j++) {
            if (array[j] <= index) {
                i++;
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        double temp = array[i + 1];
        array[i + 1] = array[endIndex];
        array[endIndex] = temp;

        return i + 1;
    }
    
    private static double[] quickSortTemp(double array[], int begin, int end) {
        if (begin < end) {
            int pi = doQuickSort(array, begin, end);

            quickSortTemp(array, begin, pi - 1);
            quickSortTemp(array, pi + 1, end);
        }

        return array;
    }

    public static void quickSortByAscending(FloatVector vector) {
        vector.setFloatVector(quickSortTemp(vector.getVector(), 0, vector.getVectorLength() - 1));
    }
}

    
