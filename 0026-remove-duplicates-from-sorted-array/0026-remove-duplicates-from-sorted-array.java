class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int k = 1;
        int n = nums.length;
        for(i=0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i+1];
                k++ ;
            }
            
        }
        return k;
    }
}