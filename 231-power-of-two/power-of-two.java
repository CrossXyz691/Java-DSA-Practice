class Solution {
    public static boolean isPowerOfTwo(int n) {
        return powerOf2(n, 0);
    }

    static boolean powerOf2(int n, int index){
        int num = (int) Math.pow(2, index);
        if(num > n || n == 2147483647){
            return false;
        }
        if(num < n){
            return powerOf2(n, index+1);
        }
        return true;
    }
}