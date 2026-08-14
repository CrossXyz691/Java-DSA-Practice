class Solution {
    public static int numberOfSteps(int num) {
        return step(num, 0);
    }

    static int step(int num, int count){
        if(num == 0){
            return count;
        }
        if(num%2 == 0 || num == 1){
            return step(num/2, count+1);
        }
        return step((num-1)/2, count+2);
    }
}