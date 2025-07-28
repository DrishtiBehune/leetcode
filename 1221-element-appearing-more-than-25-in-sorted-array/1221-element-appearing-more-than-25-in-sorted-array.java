import java.util.Arrays;
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int i ;
        int count = 1;
        int max = 0;
       
        int k = 0;
        Arrays.sort(arr);
        if(n==1){
            return arr[0];
        }
        for(i=0;i<n-1;i++){
         if(arr[i]==arr[i+1]){
            count ++ ;
           
            if(count > k ){
              k = count ;
               max = arr[i] ;
                
            }
         }
         else{
           
            count = 1;
         }
        }
        return max;
    }
}