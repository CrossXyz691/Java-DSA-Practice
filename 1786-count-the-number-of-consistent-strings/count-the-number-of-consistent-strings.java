class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] allowedChar = allowed.toCharArray();
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            boolean found = true;
            char[] c = s.toCharArray();
            for (int j = 0; j < s.length(); j++) {
                if(found){
                    for (int k = 0; k < allowedChar.length; k++) {
                        if (c[j] == allowedChar[k]) {
                            found = true;
                            break;
                        } else {
                            found = false;
                        }
                    }
                }
            }
            if(found){
                count++;
            }
        }
        return count;
    }
}