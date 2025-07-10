class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int i;
        int j;
        
        int []ss = new int[2];
        for(i=0;i<n;i++){
          
            for(j=0;j<n;j++){
                if(nums[i] + nums[j]==target && i!=j){
                ss[0] = i;
                ss[1] = j;
                return ss;
                }
            }
        }
        return ss;
    }
}