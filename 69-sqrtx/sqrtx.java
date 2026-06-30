class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x==1) {
        return x; // There is no positive perfect square less than 1
    }
    

    // Get the floored square root
    int root = (int) Math.floor(Math.sqrt(x));

    
    
    return root;
}
}