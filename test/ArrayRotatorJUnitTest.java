/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
import arrayrotator.ArrayRotator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucio Guechi
 */
public class ArrayRotatorJUnitTest {
    
    public ArrayRotatorJUnitTest() {
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

    // The methods must be annotated with annotation @Test. 
     @Test
     public void testRotateArrayOne() { 
        
        ArrayRotator arrayRotator = new ArrayRotator();

        int[] originalArray = {1,2,3,4,5,6};       
        int[] expectedArray = {5,6,1,2,3,4};
        int shiftPosition = 2;
        //Rotate Original Array Items:
        arrayRotator.arrayRot(originalArray, shiftPosition);

        assertArrayEquals(expectedArray, originalArray);}
     @Test
     public void testRotateArrayTwo() { 
        
        ArrayRotator arrayRotator = new ArrayRotator();

        int[] originalArray = {1,2,3,4,5,6};       
        int[] expectedArray = {4,5,6,1,2,3};
        int shiftPosition = 3;
        //Rotate Original Array Items:
        arrayRotator.arrayRot(originalArray, shiftPosition);

        assertArrayEquals(expectedArray, originalArray);}
}
