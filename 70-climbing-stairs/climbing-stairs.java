class Solution {
    public int climbStairs(int n) {
        return fibo(n+1);
    }

    static int fibo(int n){
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long prev2 = 0; // Index 0
        long prev1 = 1; // Index 1
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return (int)current;
    }
}