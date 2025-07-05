class Solution {
    public boolean isPalindrome(int x) {
        int digit;
        int result = 0;
        int original = x;
          
    while(x!=0 && x>0){
            digit = x%10;
            result = result*10 + digit;
            x = x/10 ;
             
        }
        boolean s = (original == result && original >=0 ? true : false);
        
        return s;

        }
       
        
    }
