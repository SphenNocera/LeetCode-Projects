import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] mf = new int[k];

        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        int index = 0;
        for (int i = 0; i < k; i++) {
            int freq = 0;
            int max = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > freq) {
                    freq = entry.getValue();
                    max = entry.getKey();
                }
            }
            map.put(max, 0);
            mf[index] = max;
            index++;
        }
        return mf;
    }
}
// @lc code=end
