import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int n = nums.length;
        int first = 0;
        int i ;
        int max = 0;
        int result = n/2 ;
        Arrays.sort(nums);
        if(n==1){
            return nums[0];
        }
      
      for( i = 1;i<n;i++){
        if(nums[i]==nums[i-1]){
         count++ ;
            }
            if(nums[i] > nums[i-1]){
                count = 1;
            }
             if(result<count){
                return nums[i];
        }
      }
      return 0;
    }
}