class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i ;
     int   k=1;
      int  count =0;
     int max  = 0;

        for(i=0;i<n;i++){
            if(nums[i]!=1){
           count = 0;
            }
            else{
                count ++;
                if(count>max){
                    max = count;
                }
            }
        }
        return max;
    }
}