package javafullstack2018.net;

import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    // sample case
    public void testSample()
    {
    	List<Integer> list = Arrays.asList(5, 9, 7, 11);
 
    	assertEquals(20, App.findMaxSum(list));
     }
    
 // large data case 
    public void testLarge()
    {
    	List<Integer> list = Arrays.asList(5, 9, 7, 11, 13,19,29,6,7,20,11,35,22,20,12,29);
    	
    	assertEquals(64, App.findMaxSum(list));
     }   
}
