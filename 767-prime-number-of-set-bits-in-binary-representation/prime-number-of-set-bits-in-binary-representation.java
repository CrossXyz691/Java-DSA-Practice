class Solution {
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            int setBits = hammingWeight(i);
            if(isPrime(setBits)){
                count++;
            }
        }

        return count;
    }

    public static int hammingWeight(int n) {
        int count = 0;
        int and = 1;

        while(n > 0){
            if((n & and) == 1){
                count++;
            }

            n >>= 1;
        }

        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}