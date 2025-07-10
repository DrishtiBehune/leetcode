class Solution {
    public boolean isSameAfterReversals(int num) {
        int result = 0;
          int reverse = 0;
          int original = num;
        while(num>0){
            int temp = num%10;
            result = result*10 + temp;
            num = num/10 ;
        }
          while(result >0){
            int tep = result %10;
            reverse = reverse*10 + tep;
            result = result/10 ;
        }
        if(reverse == original){
            return true;
        }
        else{
            return false;
        }

    }
}