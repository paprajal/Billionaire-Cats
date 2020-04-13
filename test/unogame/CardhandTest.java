/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import static junit.framework.Assert.fail;
import org.junit.Test;

/**
 *
 * @author patel
 */
public class CardhandTest {
    
    public CardhandTest() {
    }
    
    
    public void setUp() {
    }

    /**
     * Test of generateHand method, of class Cardhand.
     */
    @Test
    public void testGenerateHand() {
        System.out.println("generateHand");
        Cardhand instance = new Cardhand();
        instance.generateHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
