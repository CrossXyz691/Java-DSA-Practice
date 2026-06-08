class Solution {
    public int largestAltitude(int[] gain) {
        int check=0;
        int[] ans=new int[gain.length];
        for(int i =0;i<gain.length;i++){
            check +=gain[i];
            ans[i]=check;
        }
        int che=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>che){
                che=ans[i];
            }
        }
        return che;
    }
}