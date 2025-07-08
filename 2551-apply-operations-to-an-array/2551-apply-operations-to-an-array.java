class Solution {
    public int[] applyOperations(int[] nums) {
        int k = 0 ;
        int n = nums.length;
        int i;
        int l = 0;
        for(i=0;i<n-1;i++){
           if(nums[i] == nums[i+1]){
            nums[k] = nums[i] * 2;
            nums[k+1] = 0 ;
           }
           else{
            nums[k] = nums[i];
              }
              k++ ;
           }
            k = 0;
           for(k=0;k<n;k++){
           
            if(nums[k] != 0){
             nums[l] = nums[k];
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


