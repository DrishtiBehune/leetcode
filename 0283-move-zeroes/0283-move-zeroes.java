class Solution {
    public void moveZeroes(int[] nums) {
      int i ;
      int n = nums.length;
      int k = 0;
      for(i=0;i<n;i++)  {
        if(nums[i] != 0){
            nums[k] = nums[i];
            k++;
        }
      }
      while(k<n){
        nums[k] = 0;
        k++ ;
      }
      for(k=0;k<n;k++){
        System.out.print(nums[k] + " ");
      }
    }
}