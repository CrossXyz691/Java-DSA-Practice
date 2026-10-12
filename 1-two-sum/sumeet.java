import java.util.Arrays;

public class sumeet {
    static void main() {
        int[] nums = {2, 5, 4, 7, 9};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    static int[] mergeSort(int[] nums){
        if(nums.length == 1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] second = mergeSort((Arrays.copyOfRange(nums, mid, nums.length)));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                result[index] = first[i];
                i++;
            } else {
                result[index] = second[j];
                j++;
            }
            index++;
        }

        while(i < first.length){
            result[index] = first[i];
            i++;
            index++;
        }

        while (j < second.length){
            result[index] = second[j];
            j++;
            index++;
        }

        return result;
    }
}
