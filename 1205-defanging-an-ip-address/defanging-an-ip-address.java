class Solution {
    public String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if(i == 0){
                result.append(split[i]);
            }
            else{
                result.append("[.]");
                result.append(split[i]);
            }
        }
        return result.toString();
    }
}