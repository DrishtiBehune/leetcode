class Solution {
    public int fib(int n) {
        int i = 0 ;
        int sum = 0;
             if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            
        int [] arr = new int[n+1];
         arr[0] = 0;
         arr[1] = 1;
      
        for(i=2;i<=n;i++){
           arr[i] = arr[i-2] + arr[i-1] ;
        }
        
        sum = arr[n-1] + arr[n-2];
        return sum;
           
           
    }
}