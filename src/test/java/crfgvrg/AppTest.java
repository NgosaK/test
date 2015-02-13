package crfgvrg;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    App myApp = new App();
    App myApp2 = new App();


    public void testFloat() {
        assertEquals(5, App.getFloat(), 0);
    }

    public void testInt() {
        assertEquals(5, App.getInt());
    }

    public void testObjectSame() {
        assertSame(myApp, App.getObjectEq());
    }

    public void testObjectDiff() {
        assertNotSame(myApp2, App.getObjectId());
    }

    public void testFalse() {
        assertEquals(true, App.getFalse());
    }

    public void testTrue() {
        assertEquals(false, App.getTrue());
    }

    public void testNotNull() {
        assertNotNull(App.getNonNull());
    }

    public void testNull() {
        assertNull(App.getNull());
    }

    public void testFail() {
        fail();
    }

    public void testArray() {
        int[] myArray;
        myArray = new int[]{1, 2, 3, 5};

        assertArrayEquals(myArray, App.getArrays());
    }

    /*@Test(expected = ArithmeticException.class)
    public void testException() {
        assertEquals(4, App.divisionWithException(5, 0));
    }
    */
}


