class Solution {
    public int search(int[] nums, int target) {
        return BS(nums, target, 0, nums.length-1);
    }

    static int BS(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        if (arr[m] > target) {
            return  BS(arr, target, s, m-1);
        }
        return BS(arr, target, m+1, e);
    }
}