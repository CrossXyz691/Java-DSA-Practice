class Solution {
    public String freqAlphabets(String s) {
      StringBuilder ans = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '#'){
                i--;
                StringBuilder num = new StringBuilder();
                num.append(s.charAt(i-1));
                num.append(s.charAt(i));

                String temp = num.toString();
                int ok = Integer.parseInt(temp);
                char ok11 = (char)(ok + 96);
                ans.append(ok11);
                i--;
            }

            else{
                char o = s.charAt(i) ;
                char sa = (char) ((o - '0') + 96);
                ans.append(sa);
            }
        }
        ans.reverse();
        return ans.toString(); 
    }
}