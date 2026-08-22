class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int distance = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(count == 0){
                if(str.charAt(i) == '1'){
                    index = i;
                    count++;
                }
            }
            else{
                if(str.charAt(i) == '1'){
                    distance = Math.max(i - index, distance);
                    count = 0;
                    i--;
                }
                else{
                    continue;
                }
            }
        }
        return distance;
    }
}