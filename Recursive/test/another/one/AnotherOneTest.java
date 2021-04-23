/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another.one;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bianca Owusu
 */
public class AnotherOneTest {
    
    public AnotherOneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertionSortRecursive method, of class AnotherOne.
     */
    @Test
    public void testInsertionSortRecursive() {
        System.out.println("insertionSortRecursive");
        int[] arr = null;
        int par = 0;
        AnotherOne.insertionSortRecursive(arr, par);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AnotherOne.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AnotherOne.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
