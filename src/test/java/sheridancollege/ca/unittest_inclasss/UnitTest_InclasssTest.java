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
public class UnitTest_InclasssTest {
    
    /**
     * Test of greet method, of class UnitTest_Inclasss.
     */
    @Test
    public void testGreet() {
//        System.out.println("greet");
        UnitTest_Inclasss utd = new UnitTest_Inclasss();
//        String expResult = "";
//        String result = instance.greet();
        assertEquals("Hello World!" , utd.greet());
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
