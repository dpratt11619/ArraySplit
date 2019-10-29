package ArraySplit.ArraySplit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	private App app;

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

	public void testArraySize1Split1() {
		app = new App();
		int[] array = createTestArray(1);
		int split = 1;
		assertTrue(1 == app.splitArray(array, split).size());
	}

	public void testArraySize2Split1() {
		app = new App();
		int[] array = createTestArray(2);
		int split = 1;
		assertTrue(2 == app.splitArray(array, split).size());
	}

	public void testArraySize1Split2() {
		app = new App();
		int[] array = new int[1];
		int split = 2;
		assertTrue(1 == app.splitArray(array, split).size());
	}

	public void testArraySize2Split2() {
		app = new App();
		int[] array = createTestArray(2);
		int split = 2;
		assertTrue(1 == app.splitArray(array, split).size());
	}

	public void testArraySize10Split3() {
		app = new App();
		int[] array = createTestArray(10);
		int split = 3;
		assertTrue(4 == app.splitArray(array, split).size());
	}

	private int[] createTestArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = i;
		}
		return array;

	}
}
