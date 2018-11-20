
package by.epam.javatraining.tuharava.tasks.maintask01.model.entity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Anastasiya Tuharava
 * @version 2.0 development date: 01/11/2018
 */
public class FloatVectorTest {
    
    @Test
    public void FloatVector () {
        FloatVector vector = new FloatVector();
        int expected = FloatVector.DEFAULT_SIZE; //10
        assertEquals(expected, vector.getVectorLength());
    }
    

    
}
