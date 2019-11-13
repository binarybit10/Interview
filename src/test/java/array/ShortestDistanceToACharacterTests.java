/**
 * 
 */
package array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author Ashok
 */
public class ShortestDistanceToACharacterTests {

	@Test
	public void test() {
		ShortestDistanceToACharacter sol = new ShortestDistanceToACharacter();
		int[] res = sol.shortestToChar("loveleetcode", 'e');
		assertArrayEquals(new int[] { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 }, res);
	}
}
