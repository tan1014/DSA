

class Solution {
    Map<Integer, Integer> dp = new HashMap<>();
    public int climbStairs(int n) {
        
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        int ans = climbStairs(n - 1) + climbStairs(n - 2);
        dp.put(n, ans);

        return ans;
    }
}