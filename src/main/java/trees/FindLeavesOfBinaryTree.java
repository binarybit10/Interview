/**
 * 
 */
package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.TreeNode;

/**
 * @author Ashok
 */
public class FindLeavesOfBinaryTree {

	/*
	 * Given a binary tree, collect a tree's nodes as if you were doing this:
	 * Collect and remove all leaves, repeat until the tree is empty.
	 * 
	 * 
	 * Input: [1,2,3,4,5]
          1
         / \
        2   3
       / \     
      4   5    

	Output: [[4,5,3],[2],[1]]
	 * 
	 */
	public List<List<Integer>> findLeaves(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		while(root != null) {
			List<Integer> leaves = new ArrayList<Integer>();
			root = getLeaves(root, leaves);
			result.add(leaves);
		}
		return result;
	}
	
	private TreeNode getLeaves(TreeNode root, List<Integer> leaves) {
		if (root.left == null && root.right == null) {
			leaves.add(root.data);
			return null;
		}
		if (root.left != null) {
			root.left = getLeaves(root.left, leaves);
		}
		if (root.right != null) {
			root.right = getLeaves(root.right, leaves);
		}
		return root;
	}
}
