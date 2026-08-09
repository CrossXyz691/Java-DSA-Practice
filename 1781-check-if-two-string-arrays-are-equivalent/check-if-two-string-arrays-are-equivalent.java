class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = String.join("", word1);
        String w =String.join("", word2);
        
        return w.equals(s);
    }
}