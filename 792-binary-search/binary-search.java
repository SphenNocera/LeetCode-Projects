class Solution {
    public int search(int[] nums, int target) {
        int l, m, r;

        l = 0;
        r = nums.length-1;

        while(l <= r){
            m = l + (r - l) / 2;
            if(target < nums[m]){
                r = m - 1;
            }else if(target > nums[m]){
                l = m + 1;
            }else{
                return m;
            }
        }
        return -1;
    }
}