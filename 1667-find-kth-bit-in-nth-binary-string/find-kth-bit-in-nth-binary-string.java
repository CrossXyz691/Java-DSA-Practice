class Solution {
    public static char findKthBit(int n, int k) {
        String ans = binaryConverter(n, "0");
        return ans.charAt(k-1);
    }

    static String binaryConverter(int n, String ans){
        if(n == 1){
            return ans;
        }
        return binaryConverter(n-1, ans + '1' + reverse(invert(ans)));
    }

    static String invert(String n){
        char[] arr = n.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == '0') ? '1' : '0';
        }
        return new String(arr);
    }

    static String reverse(String n){
        char[] cont = n.toCharArray();
        int s = 0;
        int e = cont.length-1;

        while (s <= e){
            char temp = cont[s];
            cont[s] = cont[e];
            cont[e] = temp;
            s++;
            e--;
        }

        return new String(cont);
    }
}