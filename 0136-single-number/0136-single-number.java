import java.util.Arrays ;
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i =0;i<n;i++){
        k = k^nums[i];
        }
        return k;
    }
}
