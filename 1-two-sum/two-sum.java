class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if (nums[i] + nums[j] == target) {
                        a = Math.min(i, j);
                        b = Math.max(i, j);
                        return new int[]{a, b};
                    }
                }
            }
        }
        return new int[]{b, a};
    }
}