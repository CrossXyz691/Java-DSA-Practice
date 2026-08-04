class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean palincheck = false;


        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                builder.append(s.charAt(i));
            }
            else if (s.charAt(i) >= 48 && s.charAt(i) <= 57){
                builder.append(s.charAt(i));
            }
        }
        int start = 0;
        int end = builder.length() - 1;

        while(start <= end){
            if(builder.charAt(start) == builder.charAt(end)){
                palincheck = true;
                start++;
                end--;
            }

            else {
                return false;
            }
        }
        return  true;
    }
}