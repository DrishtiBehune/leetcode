class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;

        int i , totsum= 0 , reqsum =0  , count = 0, currsum=0 ;

        for( i = 0 ; i<n ; i++){
            totsum += arr[i];
        }
            if(totsum%3==0){
                reqsum = totsum/3;
            }
            else{
                return false ;
            }
        

        for( i =0 ; i<n ; i++){
             currsum = currsum + arr[i];
             if(currsum == reqsum){
                count++ ;
                currsum = 0;
             }
            
        }
     if(3<=count){
        return true;
    }
    else{
        return false;
    }
    }
    
}