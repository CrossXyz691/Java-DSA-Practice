class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp = 0;
        int count = 0;
        while(n > 0){
            if(count == 0){
                temp = n&1;
                n >>= 1;
                count++;
            }
            else{
                if(temp == (n&1)){
                    return false;
                }
                else{
                    temp = n&1;
                    n >>= 1;
                }
            }
        }
        return true;
    }
}