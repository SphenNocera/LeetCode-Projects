class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempNums = new int[m+n];

        int n1p = 0, n2p = 0;

        int i = 0;
        while(n1p < m && n2p < n){
            if(nums1[n1p] > nums2[n2p]){
                tempNums[i] = nums2[n2p];
                n2p++;
            }else{
                tempNums[i] = nums1[n1p];
                n1p++;
            }
            i++;
        }
        while(n1p < m){
            tempNums[i] = nums1[n1p];
            n1p++;
            i++;
        }
        while(n2p < n){
            tempNums[i] = nums2[n2p];
            n2p++;
            i++;
        }
        for(int j = 0; j < m + n; j++){
            nums1[j] = tempNums[j];
        }
    }
}