

        class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + digit;
            x = x / 10;
        }
        return result;
    }
}
