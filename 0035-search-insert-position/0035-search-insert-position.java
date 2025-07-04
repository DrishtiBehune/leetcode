class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int n = nums.length;
        int value=0;

        if(nums[0]>=target){
            return 0;
        }
        if(nums[n-1]<target){
            return n;
        }
        for(i=0;i<n;i++){
            if(nums[i]==target){
              return i;
            }
            else{
                if(nums[i]<target && nums[i+1]>=target){
                   return i+1;
                }
            }
           
        }
       
     return -1;
}
}