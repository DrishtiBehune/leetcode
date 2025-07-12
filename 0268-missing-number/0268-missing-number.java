import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        int n = nums.length;
      for(i=0;i<n;i++){
        if(i!=nums[i]){
            return i;
        }
       
      }
      return n;
    }
}