class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        String[] temp = trimmed.split(" ");
        String last = temp[temp.length-1];
        return last.length();
    }
}