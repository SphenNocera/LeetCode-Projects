import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for (String i : strs) {
            char[] arr = i.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            map.computeIfAbsent(sorted, k -> new ArrayList<>());
            map.get(sorted).add(i);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }
}
// @lc code=end
