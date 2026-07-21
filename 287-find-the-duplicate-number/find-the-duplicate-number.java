class Solution {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j+1 != nums[j]){
                return nums[j];
            }
        }
        return -1;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}