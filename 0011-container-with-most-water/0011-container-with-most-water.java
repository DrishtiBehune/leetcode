class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxarea = 0;
        while (right> left){
            int width = right - left;
            int currentheight;
            if(height[right]>height[left] ){
                 currentheight = height[left];
              }
              else{
                currentheight = height[right];
              }
              int currentarea = currentheight * width;
              if(currentarea > maxarea){
                maxarea = currentarea;
              }
               if(height[right]>height[left] ){
                 left++;
              }
              else{
                right-- ;
              }
        }
       return maxarea;
    }
}