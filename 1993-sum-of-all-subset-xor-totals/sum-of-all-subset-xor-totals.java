class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int totalSubsets = 1 << nums.length;

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if((i & (1 << j)) != 0){
                    temp.add(nums[j]);
                }
            }

            int f = 0;
            for (int j = 0; j < temp.size(); j++) {
                f ^= temp.get(j);
            }

            sum += f;
        }
        return sum;
    }
}