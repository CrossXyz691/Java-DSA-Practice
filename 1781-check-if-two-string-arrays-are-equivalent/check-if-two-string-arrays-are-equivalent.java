class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = String.join("", word1);
        String w =String.join("", word2);
        if(w.equals(s)){
            return true;
        }

        return false;
    }
}