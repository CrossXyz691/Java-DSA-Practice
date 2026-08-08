class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 1 && needle.length() == 1){
            if(haystack.equals(needle)){
                return 0;
            }
        }

        else if (needle.length() > haystack.length()) {
            return -1;
        }

        else{
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if(i < haystack.length()-1 && needle.length() > 1){
                        int count = 1;
                        for (int j = i + 1; j < haystack.length(); j++) {
                            if (haystack.charAt(j) != needle.charAt(count)) {
                                break;
                            } else if (count == needle.length() - 1) {
                                return i;
                            } else {
                                count++;
                            }
                        }
                    }
                    else if(needle.length() == 1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}