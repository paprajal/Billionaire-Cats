/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patel
 */
public class UnoGameTest {
    
    public UnoGameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getValue method, of class UnoGame.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        UnoGame instance = null;
        UnoGame.Value expResult = null;
        UnoGame.Value result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuit method, of class UnoGame.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        UnoGame instance = null;
        UnoGame.Suit expResult = null;
        UnoGame.Suit result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
