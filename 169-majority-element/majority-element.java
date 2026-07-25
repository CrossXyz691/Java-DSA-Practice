class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int checker = nums.length/2;

        if(nums.length > 1){
            for (int i = 0; i < nums.length-1; i++) {
                int count = 0;
                int num = nums[i];

                while(i+1<nums.length && nums[i] == nums[i+1]){
                    count++;
                    i++;
                }
                if(count >= checker){
                    return num;
                }
            }
        }
        return nums[0];
    }
}