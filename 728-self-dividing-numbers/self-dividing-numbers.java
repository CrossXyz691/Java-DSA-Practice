class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        while(left <= right){
            char[] digits = String.valueOf(left).toCharArray();
            if(self(digits, left)){
                list.add(left);
            }
            left++;
        }

        return list;
    }

    static boolean self(char[] chara, int n){
        for (int i = 0; i < chara.length; i++) {
            int a = chara[i] - '1' + 1;
            if(a != 0){
                if((n % a) == 0) {
                    continue;
                }
            }
            if(a != 0){
                if(n % a != 0){
                    return false;
                }
            }
            else{
                return false;
            }
        }

        return true;
    }
}