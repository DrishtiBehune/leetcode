import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i;
        int k =0;
       
        for(i=0;i<n;i++){
            if(k<n){
                nums[k] = nums[i] * nums[i];
                k++ ;
            }
        }
         Arrays.sort(nums);
        return nums;
    }
}