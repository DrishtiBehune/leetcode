class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n ];  // Initialize temp array
        int[] prefix = new int [n];
        int[] result = new int[n];
        int i;
             // for prefix 
             for(i=0;i<n;i++){
                if(i==0){
                    prefix[i] = nums[i];
                }
                else{
                    prefix[i] = nums[i] * prefix[i-1];
                }
             }
             //for suffix
             for(i=n-1;i>=0;i--){
                if(i==n-1){
                    suffix[i] = nums[i];
                }
                else{
                    suffix[i] = nums[i] * suffix[i+1];
                }
                
             }
              //result
                for(i=0;i<n;i++){
               result[i] = (i==0 ? 1 : prefix[i-1])* (i==n-1 ? 1 : suffix[i+1]);
                }

      return result;  
       
    }
    
}
