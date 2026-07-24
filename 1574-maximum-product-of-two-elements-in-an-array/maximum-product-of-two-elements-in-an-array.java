class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int product = (nums[nums.length-1]-1) * (nums[nums.length - 2] - 1);
        return product;
    }
}