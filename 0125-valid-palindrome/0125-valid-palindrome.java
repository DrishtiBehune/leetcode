import java.util.Arrays;
class Solution {
    public boolean isPalindrome(String s) {
      s = s.replaceAll("[^A-Za-z0-9]", "");

       s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int n = arr.length;
        String reverse = "";
        int i ;
        for( i = n-1; i>=0 ; i--){
            reverse = reverse + arr[i];
        }

      char []arr1 = reverse.toCharArray();
      if(Arrays.equals(arr , arr1)){
        return true;
      }
       
    return false;
       
    }
}