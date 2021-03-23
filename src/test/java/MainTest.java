/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stephensmac
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testCalculateLifeInsurance() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        int age = 5;
        double expResult = 325.0;
        double result = Main.calculateLifeInsurance(age);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInvalidAgeExceptionLow() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Main.calculateLifeInsurance(2);
        });
    }
    
    @Test
    public void testInvalidAgeExceptionHigh() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Main.calculateLifeInsurance(111);
        });
    }
}
