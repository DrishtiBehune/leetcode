import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr); // Fix 1: Sort the array

        int n = arr.length;
        int count = 1;
        int k = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (arr[i] == count && arr[i] > k) {
                    k = arr[i];
                }
                count = 1; // Reset for the next number
            }
        }

        // Fix 2: Check last element group after loop ends
        if (arr[n - 1] == count && arr[n - 1] > k) {
            k = arr[n - 1];
        }

        return k;
    }
}
