class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] keySet = {"type", "color", "name"};
        int checkerIndex = 0;
        int count = 0;

        for (int i = 0; i < keySet.length; i++) {
            if (ruleKey.equals(keySet[i])){
                checkerIndex = i;
            }
        }

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(checkerIndex).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}