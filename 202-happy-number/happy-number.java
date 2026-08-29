class Solution {
    public static boolean isHappy(int n) {
        return happy(n, n, 0);
    }

    static boolean happy(int n, int a, int c){
        if(c > 0 && n == a){
            return false;
        }
        if(a < 7 || (a > 7 && a < 10)){
            if(a == 1){
                return true;
            }

            else{
                return false;
            }
        }
        int sum = 0;
        while(a > 0){
            sum += (a % 10) * (a % 10);
            a /= 10;
        }
        c++;

        return happy(n, sum, c);
    }
}