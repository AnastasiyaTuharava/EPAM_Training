
package by.epam.java0.tuharava.model.logic;

import static by.epam.java0.tuharava.model.logic.CountDragonHeadsAndEyes.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CountDragonHeadsAndEyesTest {
    
    @Test
    public void testGetHeads1 () {
        int age = -5;
        int res = 0;
        
        assertEquals(res, getHeads(age));
    }
    
    @Test
    public void testGetHeads2 () {
        int age = 0;
        int res = 3;
        
        assertEquals(res, getHeads(age));
    }
    
    @Test
    public void testGetHeads3 () {
        int age = 5;
        int res = 18;
        
        assertEquals(res, getHeads(age));
    }
    
    @Test
    public void testGetHeads4 () {
        int age = 205;
        int res = 612;
        
        assertEquals(res, getHeads(age));
    }
    
    @Test
    public void testGetHeads5 () {
        int age = 303;
        int res = 804;
        
        assertEquals(res, getHeads(age));
    }
    
    @Test
    public void testGetEyes () {
        int heads = 15;
        int res = 30;
        
        assertEquals(res, getEyes(heads));
    }
}
