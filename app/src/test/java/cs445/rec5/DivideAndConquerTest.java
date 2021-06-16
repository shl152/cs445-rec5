package cs445.rec5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

/**
* A class implementing JUnit tests for DivideAndConquer class.
*/
public class DivideAndConquerTest {

	/**
	* Test case for reverse an array method
	*/
	@Test
	public void test_reverse(){

		Integer a[] = {0, 1, 2, 3, 4, 5};
		Integer a_reversed[] = {5, 4, 3, 2, 1, 0};
		DivideAndConquer.reverse(a);

		Double b[] = {5.5, 4.5, 3.5, 2.5, 1.5};
		Double b_reversed[] = {1.5, 2.5, 3.5, 4.5, 5.5};
		DivideAndConquer.reverse(b);

		assertTrue(Arrays.equals(a, a_reversed));
		assertTrue(Arrays.equals(b, b_reversed));

	}

	/**
	* Test case for find min and max method
	*/
	@Test
	public void test_MinMax(){

		int a[] = {22, 1, 55, 100, 44, 400, 6};
		DivideAndConquer.MinMax result = DivideAndConquer.findMinMax(a);

		assertEquals(result.min, 1,  "Min is not determined correctly!");
		assertEquals(result.max, 400, "Max is not determined correctly!");
	}

}

