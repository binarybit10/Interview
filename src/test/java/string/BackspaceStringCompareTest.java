/**
 * 
 */
package string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Ashok
 */
public class BackspaceStringCompareTest {

	@Test
	public void test() {
		BackspaceStringCompare bc = new BackspaceStringCompare();
		String S, T;
		S = "ab#c"; T = "ad#c";
		assertTrue(bc.backspaceCompare(S, T));
		
		S = "ab##"; T = "c#d#";
		assertTrue(bc.backspaceCompare(S, T));
		
		 S = "a##c"; T = "#a#c";
		assertTrue(bc.backspaceCompare(S, T));
		
		S = "a#c"; T = "b";
		assertFalse(bc.backspaceCompare(S, T));
	}
}
