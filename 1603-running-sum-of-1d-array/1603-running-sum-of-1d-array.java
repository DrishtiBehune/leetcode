class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int i;
        int k = 0;
        nums[k] = nums[0];
        k = 1;
        for(i=1;i<n;i++){
            if(k<n){
              nums[k] =   nums[i] + nums[i-1];
              k++ ;
            }
        }
        return nums;
    }
}