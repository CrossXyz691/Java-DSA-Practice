class Solution {
    public static String sortSentence(String s) {
        String[] cont = s.split(" ");

        int[] indices = new int[cont.length];
        for (int i = 0; i < cont.length; i++) {
            indices[i] = cont[i].charAt(cont[i].length()-1)-49;
        }

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

        for (int j = 0; j < cont.length; j++) {
            cont[j] = cont[j].substring(0, cont[j].length()-1);
        }

        return String.join(" ", cont);
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