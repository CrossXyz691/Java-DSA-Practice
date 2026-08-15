class Solution {
    public static int findTargetSumWays(int[] nums, int target) {
        return calc(nums, target, 0, 0);
    }

    static int calc(int[] nums, int target, int index, int sum){
        if(index == nums.length){
            return sum == target ? 1 : 0;
        }

        int add = calc(nums, target, index+1 , sum+nums[index]);
        int subtract = calc(nums, target, index+1, sum-nums[index]);

        return add+subtract;
    }
}