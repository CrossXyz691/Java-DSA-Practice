class Solution {
    public static boolean isPowerOfThree(int n) {
        return powerOf3(n, 0);
    }

    static boolean powerOf3(int n, int index){
        int num = (int) Math.pow(3, index);
        if(num > n || n == 2147483647){
            return false;
        }
        if(num < n){
            return powerOf3(n, index+1);
        }
        return true;
    }
}