
package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.FloatVector;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Anastasiya Tuharava
 * @version 2.0
 * development date: 01/11/2018
 */
public class CalculateAndModifyTest {
    
    @Test
    public void calcGeometricMean () {
        double[] array = { 9, 3, 1};
        FloatVector vector = new FloatVector(array);
        double expected = 3;
        double actual1 = CalculateAndModify.calcGeometricMean(vector);
        double delta = 0.1;
        assertEquals(expected, actual1, delta);
    }
    
    @Test
    public void calcArithmeticalMean () {
        double[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        FloatVector vector = new FloatVector(array);
        double expected = 3;
        double actual = CalculateAndModify.calcArithmeticalMean(vector);
        double delta = 0.1;
        assertEquals(expected, actual, delta);
    }
    
    @Test
    public void isOrderedAscending () {
        double[] array = {1, 2, 3, 4, 5};
        FloatVector vector = new FloatVector(array);
        boolean expected = true;
        boolean actual = CalculateAndModify.isOrderedAscending(vector);
        double delta = 0.1;
        assertEquals(expected, actual);
    }
    
    @Test
    public void isOrderedDescending () {
        double[] array = {5, 4, 3, 2, 1};
        FloatVector vector = new FloatVector(array);
        boolean expected = true;
        boolean actual = CalculateAndModify.isOrderedDescending(vector);
        double delta = 0.1;
        assertEquals(expected, actual);
    }
    
    @Test
    public void reverseArrayElements () {
        double[] actual = {5, 4, 3, 2, 1};
        FloatVector vector = new FloatVector(actual);
        CalculateAndModify.reverseArrayElements(vector);
        actual = vector.getVector();
        double [] expected = {1, 2, 3, 4, 5};
        double delta = 0.1;
        assertArrayEquals(expected, actual, delta);
    }
    
    
}