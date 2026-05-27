class Solution {
    public int[] getConcatenation(int[] nums) {
      
    int[] arr = new int[nums.length*2];
    int a= arr.length-1;
    int b = nums.length-1;
    for (int i = 0; i < nums.length; i++) {
        arr[i]=nums[i];
        arr[a]=nums[b];
        a--;
        b--;
    }  
    return arr;
    }
}