class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        return addBinary1(a, b, a.length()-1, b.length()-1, 0, sb);
    }

    private static String addBinary1(String a, String b, int i, int j, int carry, StringBuilder sb) {
        if(i<0 && j<0 && carry==0){
            return sb.reverse().toString();
        }

        int sum = carry;

        if (i >= 0) {
            sum += a.charAt(i) - '0';
        }
        if (j >= 0) {
            sum += b.charAt(j) - '0';
        }
        sb.append(sum % 2);

        return addBinary1(a, b, i-1, j-1, sum/2, sb);
    }
}