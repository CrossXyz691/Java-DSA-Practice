class Solution {
    public static String restoreString(String s, int[] indices) {
        String[] cont = s.split("");
        int i = 0;
        while(i<indices.length){
            int correct = indices[i];
            if(indices[i] != indices[correct]){
                swap(cont, i, correct);
                swap1(indices, i, correct);
            }
            else{
                i++;
            }
        }

        s = String.join("", cont);
        return s;
    }

    static void swap(String[] nums, int first, int second){
        String temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void swap1(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}