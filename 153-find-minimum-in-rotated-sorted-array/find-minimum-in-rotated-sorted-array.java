class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int m = 0;
        int min = Integer.MAX_VALUE;

        while(l <= r){
            m = l + (r - l) / 2;
            if(nums[l] < min){
                min = nums[l];
            }
            if(nums[r] < min){
                min = nums[r];
            }
            if(nums[m] < min){
                min = nums[m];
            }
            if(nums[l] < nums[m]){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return min;
    }
}