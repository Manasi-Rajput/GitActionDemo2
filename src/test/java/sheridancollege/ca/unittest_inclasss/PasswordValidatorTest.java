/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sheridancollege.ca.unittest_inclasss;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rajpu
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    

    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String password = "mylongPassword";
 
       assertEquals(true, PasswordValidator.checkLength(password));
        // TODO review the generated test code and remove the default call to fail.
 
    }
    
        @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String password = "mylongPassword";
        assertEquals(true, PasswordValidator.checkLength(password));
        // TODO review the generated test code and remove the default call to fail.
 
    }
    
    //Boundary
    
        @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLengthGood");
        String password = "password"; //=8
        assertEquals(true, PasswordValidator.checkLength(password));
        // TODO review the generated test code and remove the default call to fail.
 
    }
    
}
