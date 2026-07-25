class Solution {
    public static int[] sortArrayByParity(int[] arr) {
        int n =arr.length;
        int l = 0;
        int r = n- 1;

        while (l < r) {
            if (arr[l] % 2 == 0) {
                l++;
            }
            else if (arr[r] % 2 == 1) {
                r--;
            }
            else {
                swap(arr, l, r);

                l++;
                r--;
            }
        }
        return arr;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}