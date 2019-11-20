/**
 * 
 */
package string;

/**
 * @author Ashok
 */
public class BackspaceStringCompare {

	/*
	 * Given two strings S and T, return if they are equal when both are typed into
	 * empty text editors. # means a backspace character.
	 * 
	 * Example 1:

		Input: S = "ab#c", T = "ad#c"
		Output: true
		Explanation: Both S and T become "ac".
		Example 2:
		
		Input: S = "ab##", T = "c#d#"
		Output: true
		Explanation: Both S and T become "".
		Example 3:
		
		Input: S = "a##c", T = "#a#c"
		Output: true
		Explanation: Both S and T become "c".
		Example 4:
		
		Input: S = "a#c", T = "b"
		Output: false
		Explanation: S becomes "c" while T becomes "b".
	 * 
	 */
	public boolean backspaceCompare(String S, String T) {
		if(S == null || T == null) {
			return S == T;
		}
		int i = S.length() - 1;
		int j = T.length() - 1;
		
		int backspaceCount;
		
		while(i >= 0 && j >= 0) {
			backspaceCount = 0;
			while(S.charAt(i) == '#' && i >= 0) {
				backspaceCount++;
				i--;
			}
			i -= backspaceCount;
			
			backspaceCount = 0;
			while(S.charAt(j) == '#' && j >= 0) {
				backspaceCount++;
				j--;
			}
			j -=backspaceCount;
			
			char sChar = (i < 0) ? '#' : S.charAt(i);
			char tChar = (j < 0) ? '#' : T.charAt(j);

			if (sChar != tChar) {
				return false;
			}
			i--;
			j--;
		}
		return true;
	}
}
