class Solution {
    public static int numberOfSteps(int num) {
       int setBits = Integer.bitCount(num);
        String str = Integer.toBinaryString(num);
        int bitLength = str.length();
        return setBits + bitLength - 1;
    }
}