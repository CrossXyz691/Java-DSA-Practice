class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr= new int[nums.length];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=nums[nums[i]];
    }
    System.out.println(Arrays.toString(arr));
    return arr;}
    
}