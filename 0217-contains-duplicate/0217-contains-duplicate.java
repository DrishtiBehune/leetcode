import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i;
        for(i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}