class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x==1) {
        return x; // There is no positive perfect square less than 1
    }
    

    // Get the floored square root
    long root = (long) Math.floor(Math.sqrt(x));

    
    
    return (int) Math.clamp(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
}