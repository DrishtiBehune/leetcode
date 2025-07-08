class Solution {
    public int[] applyOperations(int[] nums) {
        
        int n = nums.length;
        int i;
        int l = 0;
        for(i=0;i<n-1;i++){
           if(nums[i] == nums[i+1]){
            nums[i] = nums[i] * 2;
            nums[i+1] = 0 ;
            }
            
           
           }
           for(i=0;i<n;i++){
            if(nums[i] != 0){
             nums[l] = nums[i];
             l++;
            }
           }
           while(l<n){
            nums[l] = 0;
            l++;
           }
           return nums;
         
    }
}