class Solution {
    public void reverseString(char[] s) {
        System.out.println(Arrays.toString(rS(s, 0, s.length-1)));
    }

    static char[] rS(char[] st, int s, int e){
        if(s > e){
            return st;
        }

        swap(st, s, e);
        s++;
        e--;
        return rS(st, s, e);
    }

    static void swap(char[] nums, int first, int second){
        char temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}