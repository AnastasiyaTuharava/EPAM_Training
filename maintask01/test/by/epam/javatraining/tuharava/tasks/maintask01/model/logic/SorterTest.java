package by.epam.javatraining.tuharava.tasks.maintask01.model.logic;

import by.epam.javatraining.tuharava.tasks.maintask01.model.entity.FloatVector;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author Anastasiya Tuharava
 * @version 2.0 development date: 01/11/2018
 */
public class SorterTest {
    
    private static double [] array = {-10, 15, 17, 1, 0};
    
    private static FloatVector vector;

    private static double[] expectedSortAsc = {-10, 0, 1, 15, 17};
    
    private static double[] expectedSortDes = {17, 15, 1, 0, -10};
    
    private double delta = 0.1;
    
    @BeforeClass
    public static void init() {
        vector = new FloatVector(array);
    }

    @AfterClass
    public static void del() {
        vector = null;
    }
    
    @Test
    public void sortBubbleByDescending() {
        Sorter.sortBubbleByDescending(vector);
        double [] actual = vector.getVector();
        assertArrayEquals(expectedSortDes, actual, delta);
    }

    @Test
    public void sortInsertionByDescending() {
        Sorter.sortInsertionByDescending(vector);
        double [] actual = vector.getVector();
        assertArrayEquals(expectedSortDes, actual, delta);
    }
    
    @Test
    public void sortSelectionByAscending() {
        Sorter.sortSelectionByAscending(vector);
        double [] actual = vector.getVector();
        assertArrayEquals(expectedSortAsc, actual, delta);
    }
    
    @Test
    public void sortMergeInAscendingOrder() {
        Sorter.sortMergeByAscending(vector);
        double [] actual = vector.getVector();
        assertArrayEquals(expectedSortAsc, actual, delta);
    }
    
    @Test
    public void quickSortByAscending() {
        Sorter.quickSortByAscending(vector);
        double [] actual = vector.getVector();
        assertArrayEquals(expectedSortAsc, actual, delta);
    }
    
}
