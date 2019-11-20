/**
 * 
 */
package array;

/**
 * @author Ashok
 */
public class MaximumSubarray {

	/*
	 * 
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum.
	 * 
	 * Example:
	 * 
	 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
	 * largest sum = 6.
	 */
	public int maxSubArray(int[] nums) {

		if (nums == null) {
			return 0;
		}

		if (nums.length == 1) {
			return nums[0];
		}

		int maxHere = nums[0];
		int maxRes = nums[0];

		for (int i = 1; i < nums.length; i++) {
			maxHere = Math.max(maxHere + nums[i], nums[i]);
			maxRes = Math.max(maxHere, maxRes);
		}
		
		return maxRes;
	}
}
