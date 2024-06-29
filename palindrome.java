class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int sum = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            int r = temp % 10;
            temp /= 10;
            if (r > (Integer.MAX_VALUE - r) / 10) {
                return false;
            }
            sum = (sum * 10) + r;
        }

        if (sum == x) {
            return true;
        }
        return false;
    }
}
