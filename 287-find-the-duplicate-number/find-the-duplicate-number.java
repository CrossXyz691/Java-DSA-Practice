class Solution {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;

        while(j<nums.length){
            if(nums[j] == nums[i]){
                return nums[i];
            }
            else{
                j++;
                i++;
            }
        }
        return -1;
    }
}