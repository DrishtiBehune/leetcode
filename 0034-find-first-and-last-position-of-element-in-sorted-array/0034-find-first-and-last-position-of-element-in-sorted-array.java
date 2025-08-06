class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        
        int n = nums.length;
        
        // Loop to find the first and last positions
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (arr[0] == -1) {
                    arr[0] = i; // first occurrence
                }
                arr[1] = i; // last occurrence keeps updating
            }
        }
        
        return arr;
    }
}
