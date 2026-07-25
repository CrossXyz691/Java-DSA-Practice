class Solution {
    public static int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0){
                swap(nums, i, count);
                count++;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}