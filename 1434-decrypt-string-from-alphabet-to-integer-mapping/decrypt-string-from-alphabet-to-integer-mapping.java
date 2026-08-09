class Solution {
    public String freqAlphabets(String s) {
      StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i+2<s.length() && s.charAt(i+2) != '#'){
                char o = s.charAt(i) ;
                char sa = (char) ((o - '0') + 96);
                sb.append(sa);
            }
            else if(i+2<s.length() && s.charAt(i+2) == '#'){
                StringBuilder num = new StringBuilder();
                num.append(s.charAt(i));
                num.append(s.charAt(i+1));

                String temp = num.toString();
                int nums = Integer.parseInt(temp);
                char sa = (char) (nums + 96);
                sb.append(sa);
                i+=2;
            }

            else{
                char o = s.charAt(i) ;
                char sa = (char) ((o - '0') + 96);
                sb.append(sa);
            }
        }
        return sb.toString();  
    }
}