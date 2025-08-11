class Solution {
    public int nthUglyNumber(int n) {
        // Array to store the sequence of ugly numbers
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1; // The first ugly number is always 1

        // Pointers for multiples of 2, 3, and 5
        int pointer2 = 0;
        int pointer3 = 0;
        int pointer5 = 0;

        // Next multiples of 2, 3, and 5
        int nextMultipleOf2 = 2;
        int nextMultipleOf3 = 3;
        int nextMultipleOf5 = 5;

        // Generate ugly numbers from 2nd to nth
        for (int i = 1; i < n; i++) {
            // Choose the smallest among the next candidates
            int nextUgly = Math.min(nextMultipleOf2, 
                           Math.min(nextMultipleOf3, nextMultipleOf5));

            uglyNumbers[i] = nextUgly;

            // Update the pointer(s) for whichever matched
            if (nextUgly == nextMultipleOf2) {
                pointer2++;
                nextMultipleOf2 = uglyNumbers[pointer2] * 2;
            }
            if (nextUgly == nextMultipleOf3) {
                pointer3++;
                nextMultipleOf3 = uglyNumbers[pointer3] * 3;
            }
            if (nextUgly == nextMultipleOf5) {
                pointer5++;
                nextMultipleOf5 = uglyNumbers[pointer5] * 5;
            }
        }

        // The last element in the array is the nth ugly number
        return uglyNumbers[n - 1];
    }
}
