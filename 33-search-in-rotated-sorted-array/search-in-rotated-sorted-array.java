class Solution {
    static int search(int[] nums,int target) {
    int peak = 0;
    if(nums.length-1!=2) {
        peak = peakInArr(nums);
    }
    else{
        peak = findIndexOfGreatest(nums);
    }
    if(peak!=nums.length-1) {
        if (binarysearch(nums, target, 0, peak) != -1) {
            return binarysearch(nums, target, 0, peak);
        } else {
            return (binarysearch(nums, target, peak + 1, nums.length - 1));
        }
    }
    else{
        return binarysearch(nums,target,0,nums.length-1);
    }

}

    static int peakInArr(int[] nums) {
    if (nums == null || nums.length == 0) {
        return -1;
    }

    int left = 0;
    int right = nums.length - 1;

    if (nums[left] <= nums[right]) {
        return right;
    }

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
            return mid;
        }

        if (mid > 0 && nums[mid] < nums[mid - 1]) {
            return mid - 1;
        }

        if (nums[mid] >= nums[left]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}


public static int findIndexOfGreatest(int[] array) {
    if (array == null || array.length == 0) {
        return -1;
    }

    int maxIndex = 0; 
    
    for (int i = 1; i < array.length; i++) {
        if (array[i] > array[maxIndex]) {
            maxIndex = i;
        }
    }

    return maxIndex;
}

static int binarysearch(int[] nums, int target,int start,int end){
    boolean isAsc = nums[start]<=nums[end];
    while (start <= end){
         if(isAsc){
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
         else{
             int mid = start + (end-start)/2;
             if (nums[mid]>target){
                 start=mid+1;
             }
             else if (nums[mid]<target) {
                 end=mid-1;
             }
             else {
                 return mid;
             }
         }
    }
    return -1;
}

}