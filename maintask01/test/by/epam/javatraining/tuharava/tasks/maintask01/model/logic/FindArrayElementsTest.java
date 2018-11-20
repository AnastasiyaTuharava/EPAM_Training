
package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.FloatVector;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Anastasiya Tuharava
 * @version 2.0
 * development date: 01/11/2018
 */
public class FindArrayElementsTest {
    
    private double[] array1 = { -300, 800, 0, 1, 20, 2, 21, 600};
    private FloatVector vector1 = new FloatVector(array1);
    
    @Test
    public void findMaxElement () {
        
        double expected = 800;
        double actual = FindArrayElements.findMaxElement(vector1);
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }
    
    @Test
    public void findMinElement () {
        double expected = -300;
        double actual = FindArrayElements.findMinElement(vector1);
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }
    
    @Test
    public void determineIndexOfFirstLocalMax () {
        double expected = 1;
        double actual = FindArrayElements.determineIndexOfFirstLocalMax(vector1);
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }
    
    @Test
    public void determineIndexOfFirstLocalMin () {
        double expected = 2;
        double actual = FindArrayElements.determineIndexOfFirstLocalMin(vector1);
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }
    
    @Test
    public void binaryIndexSearchElement () {
        double expected = 2;
        double actual = FindArrayElements.binaryIndexSearchElement(0, vector1);
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }
    
    @Test
    public void linearIndexSearchElement () {
        double expected = 2;
        double actual = FindArrayElements.linearIndexSearchElement (0, vector1);
        double delta = 0.0001;
        assertEquals(expected, actual, delta);
    }
}