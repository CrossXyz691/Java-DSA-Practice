class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length()-1; i++) {
            if (command.charAt(i+1) == ')') {
                result.append("o");
                i++;
            }
            else if(command.charAt(i) == 'G'){
                result.append("G");
            }
            else{
                result.append("al");
                i += 3;
            }
        }
        int last = command.length()-1;
        if(command.charAt(last) == 'G'){
            result.append("G");
        }
        return result.toString();
    }
}