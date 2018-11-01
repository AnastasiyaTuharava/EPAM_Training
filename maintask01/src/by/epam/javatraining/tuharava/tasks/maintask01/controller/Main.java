
package by.epam.javatraining.tuharava.tasks.maintask01.controller;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.Vector;
import by.epam.javatraining.tuharava.tasks.maintask01.model.logic.PerformVectorOperations;
import by.epam.javatraining.tuharava.tasks.maintask01.view.ConsoleOutput;
import java.util.Scanner;

/**
 * This program is created to work with arrays. Using it, it is possible:
 * find the extreme values ​​(minimum and maximum elements), 
 * find the arithmetic mean and geometric mean values ​​of all elements, 
 * check whether all elements of the vector are in an ordered form, 
 * find the position of the first encountered local minimum (maximum), 
 * to find the position of the element of the array in two ways (linear or binary),
 * reverse all elements of the vector, 
 * sort the array in several ways.
 * 
 * @author Anastasiya Tuharava
 * @version 1.0
 * development date: 01/11/2018
 * 
 */

public class Main {
    public static void main(String[] args) {
        
        int size;
        do {
            ConsoleOutput.showOnConsole("Enter array size: ");
            Scanner in = new Scanner(System.in);
            size = in.nextInt();
        } while (size <= 0);
        
        Vector vector = new Vector (size);
        
        ConsoleOutput.showOnConsole("Select the array creation method: ");
        ConsoleOutput.showOnConsole("1. Enter from console ");
        ConsoleOutput.showOnConsole("2. Generate randomly ");
        
        int way;
        do {
            ConsoleOutput.showOnConsole("Enter array size: ");
            Scanner in = new Scanner(System.in);
            way = in.nextInt();
        } while ((way != 1) | (way != 2));
        
        switch (way) {
            case 1: 
                Vector.setVectorByConsole();
                break;
            case 2:
                Vector.setVectorByRandom();
                break;  
        }
        
        int operation;
        do {
            ConsoleOutput.showOnConsole("Select array operation: ");
            ConsoleOutput.showOnConsole("0. if you want to complete the program ");
            ConsoleOutput.showOnConsole("1. find Max Element ");
            ConsoleOutput.showOnConsole("2. find Min Element ");
            ConsoleOutput.showOnConsole("3. calculate Geometric Mean ");
            ConsoleOutput.showOnConsole("4. calculate Arithmetical Mean ");
            ConsoleOutput.showOnConsole("5. check if array is Ordered Ascending ");
            ConsoleOutput.showOnConsole("6. check if array is Ordered Descending ");
            ConsoleOutput.showOnConsole("7. determine Index Of First Local Max  ");
            ConsoleOutput.showOnConsole("8. determine Index Of First Local Min ");
            ConsoleOutput.showOnConsole("9. binary Index Search Element ");
            ConsoleOutput.showOnConsole("10. linear Index Search Element ");
            ConsoleOutput.showOnConsole("11. reverse Array Elements ");
            ConsoleOutput.showOnConsole("12. sort Array Bubble By Descending ");
            ConsoleOutput.showOnConsole("13. sort Array Insertion By Descending ");
            ConsoleOutput.showOnConsole("14. sort Selection By Ascending ");
            
            Scanner in = new Scanner(System.in);
            operation = in.nextInt();
        } while (operation < 0 | operation > 14);
        
        switch (operation) {
            case 0:
                break;
            case 1:
                PerformVectorOperations.findMaxElement(vector);
                break;
            case 2:
                PerformVectorOperations.findMinElement(vector);
                break;
            case 3:
                PerformVectorOperations.calcGeometricMean(vector);
                break;
            case 4:
                PerformVectorOperations.calcArithmeticalMean(vector);
                break;
            case 5:
                PerformVectorOperations.isOrderedAscending(vector);
                break;
            case 6:
                PerformVectorOperations.isOrderedDescending(vector);
                break;
            case 7:
                PerformVectorOperations.determineIndexOfFirstLocalMax(vector);
                break;
            case 8:
                PerformVectorOperations.determineIndexOfFirstLocalMin(vector);
                break;
            case 9:
                ConsoleOutput.showOnConsole("enter the element you want to find ");
                Scanner in1 = new Scanner(System.in);
                double element1 = in1.nextDouble();
                PerformVectorOperations.binaryIndexSearchElement(element1, vector);
                break;
            case 10:
                ConsoleOutput.showOnConsole("enter the element you want to find ");
                Scanner in2 = new Scanner(System.in);
                double element2 = in2.nextDouble();
                PerformVectorOperations.linearIndexSearchElement(element2, vector);
                break;
            case 11:
                PerformVectorOperations.reverseArrayElements(vector);
                break;
            case 12:
                PerformVectorOperations.sortArrayBubbleByDescending(vector);
                break;
            case 13:
                PerformVectorOperations.sortArrayInsertionByDescending(vector);
                break;
            case 14:
                PerformVectorOperations.sortSelectionByAscending(vector);
                break;
        }
        
    }
}

