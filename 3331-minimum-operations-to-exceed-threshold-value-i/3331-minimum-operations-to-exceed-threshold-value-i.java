class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int i;
        int largest = k;
        int count = 0;
        for(i=0;i<n;i++){
            if(nums[i] < largest){
            count ++ ;
            }
        }
        return count ;
    }
}