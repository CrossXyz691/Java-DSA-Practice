class Solution {
    public int findNumbers(int[] nums) {
        int n=0;
for(int i=0;i<nums.length;i++){
int a=nums[i];
int d =0;
while(a!=0){
a/=10;
d++;
}
if(d %2==0){
n++;
}
}
return n;
    }
}