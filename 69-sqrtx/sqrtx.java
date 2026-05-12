class Solution {
    public int mySqrt(int n) {
        if (n < 2) return n; 
        int low = 1, high = n / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sq = (long) mid * mid;       

            if (sq == n) return mid;
            else if (sq > n) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }
}