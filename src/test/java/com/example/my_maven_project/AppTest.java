package com.example.my_maven_project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddition() {
        assertEquals(5,2+3);//JEnkins webhook
    }
    @Test
    public void testSubtraction() {
        assertEquals(5,8-3);  //FAIL:expected 10,actual 5
    }
    @Test
    public void testMultiplication() {
        assertEquals(16,4*4); //FAIL:expected 20,actual 16
    }
    @Test
    public void testDivision() {
        assertEquals(5,10/2);  //PASS
    }
    
}
