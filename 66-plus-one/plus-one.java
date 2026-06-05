import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        int d=0;
        BigInteger a=BigInteger.valueOf(1);
        BigInteger j=BigInteger.valueOf(0);
        int n=digits.length-1;
        while(n!=0){
            a = a.multiply(BigInteger.TEN);
            n--;
        }
        for(int i=0;i<digits.length;i++){
            BigInteger currentDigit = BigInteger.valueOf(digits[i]);
j = j.add(currentDigit.multiply(a));
            a = a.divide(BigInteger.TEN);
        }
        j = j.add(BigInteger.ONE);
        BigInteger f=j;
        while (!f.equals(BigInteger.ZERO)) {
            d++;
            f = f.divide(BigInteger.TEN);
        }
        int[] plus = new int[d];
        for(int x=d-1;x>=0;x--){
            plus[x] = j.remainder(BigInteger.TEN).intValue();
        j = j.divide(BigInteger.TEN);
        }
        return plus;
    }
}