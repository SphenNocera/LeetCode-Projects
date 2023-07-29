/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] ans = new int[n];
        int prod = 1;
        pre[0] = 1;
        suf[n - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i - 1] * prod;
            prod = pre[i];
        }
        prod = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = nums[i + 1] * prod;
            prod = suf[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pre[i] * suf[i];
        }
        return ans;
    }
}
// @lc code=end
