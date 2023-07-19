/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numList = new HashMap<>();
        int[] pos = {0, 0}; 

        for(int i = 0; i < nums.length; i++){
            if(numList.containsKey(target - nums[i])){
                pos[0] = i;
                pos[1] = numList.get(target - nums[i]);
                break;
            }
            numList.put(nums[i], i);
        }
        return pos;
    }
}
// @lc code=end

