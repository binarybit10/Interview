/**
 * 
 */
package trees;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import utils.TreeNode;

/**
 * @author Ashok
 */
public class FindLeavesOfBinaryTreeTests {

	@Test
	public void test() {
		
		FindLeavesOfBinaryTree sol = new FindLeavesOfBinaryTree();
		List<List<Integer>> actualRes = sol.findLeaves(buildTestTree());
		
		List<List<Integer>> expectedRes = new ArrayList<List<Integer>>();
		
		expectedRes.add(Arrays.asList(4,5,3));
		expectedRes.add(Arrays.asList(2));
		expectedRes.add(Arrays.asList(1));
		
		assertEquals(expectedRes, actualRes);
		System.out.println(actualRes);
	}
	
	/*
	 * 
	      1
         / \
        2   3
       / \     
      4   5   
	 
	 */
	private TreeNode buildTestTree() {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right =  new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		return root;
	}
}
