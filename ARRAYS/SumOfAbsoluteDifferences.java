// LeetCode: Sum of Absolute Differences in a Sorted Array
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];

        // Prefix Sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Calculate answer
        for (int i = 0; i < n; i++) {

            int leftSum = prefixSum[i] - nums[i];

            int rightSum = prefixSum[n - 1] - prefixSum[i];

            result[i] = (nums[i] * i)
                      - leftSum
                      + rightSum
                      - (nums[i] * (n - i - 1));
        }

        return result;
    }
}