class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> disappeared = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j+1 != nums[j]){
                disappeared.add(nums[j]);
            }
        }
        return disappeared;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}