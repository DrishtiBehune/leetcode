
import java.util.Arrays;
class Solution {

    public int findDuplicate(int[] nums)  {
        int n = nums.length;
          Arrays.sort(nums);
          for(int i = 1 ; i<=n ; i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
          }
          return -1;
    }

}

        
    
