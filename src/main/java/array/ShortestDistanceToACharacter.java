/**
 * 
 */
package array;

/**
 * @author Ashok
 */
public class ShortestDistanceToACharacter {

	/*
	 * Given a string S and a character C, return an array of integers representing
	 * the shortest distance from the character C in the string.
	 * 
	 * Example 1:
	 * 
	 * Input: S = "loveleetcode", C = 'e' Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1,
	 * 0]
	 */
	public int[] shortestToChar(String S, char C) {
		int[] res = new int[S.length()];
		if (S == null || S.isEmpty()) {
			return res;
		}

		int counter = S.length();
		for (int i = 0; i < S.length(); i++) {
			if (C == S.charAt(i)) {
				counter = 0;
			}
			res[i] = counter++;
		}
		counter = S.length();
		for (int i = S.length() - 1; i >= 0; i--) {
			if (C == S.charAt(i)) {
				counter = 0;
			}
			res[i] = Math.min(res[i], counter);
			counter++;
		}

		return res;
	}
}
