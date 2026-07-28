class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int pos=n-1;
        int res[]= new int[n];
        while(l<=r){
            int leftsq=nums[l]*nums[l];
            int rightsq=nums[r]*nums[r];
            if(leftsq>rightsq)
            {
                res[pos]=leftsq;
                l++;
                pos--;
            }
            else
            {
                res[pos]=rightsq;
                r--;
                pos--;
            }             
        }
     return res; 
    }
}