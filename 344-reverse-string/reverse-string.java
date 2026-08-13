class Solution {
    public void reverseString(char[] s) {
        System.out.println(Arrays.toString(rS(s, 0, s.length-1)));
    }

    static char[] rS(char[] st, int s, int e){
        if(s > e){
            return st;
        }

        char temp = st[s];
        st[s] = st[e];
        st[e] = temp;
        s++;
        e--;
        return rS(st, s, e);
    }
    
}