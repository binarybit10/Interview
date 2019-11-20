/**
 * 
 */
package array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Ashok
 */
public class MaximumSubarrayTest {

	@Test
	public void test() {
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		assertEquals(6, maximumSubarray.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}
