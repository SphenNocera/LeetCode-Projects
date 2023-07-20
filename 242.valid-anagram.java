/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String a = Arrays.toString(sArr);
        String b = Arrays.toString(tArr);

        if (a.equals(b)) {
            return true;
        }
        return false;
    }
}
// @lc code=end
