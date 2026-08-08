class Solution {
    public int romanToInt(String s) {
          String[] temp = s.split("(?<=(.))(?!\\1)");
        int[] nums = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            String value = temp[i];
            int  count = value.length();
            switch(value.charAt(0)) {
                case 'I' -> nums[i] = 1 * count;
                case 'V' -> nums[i] = 5 * count;
                case 'X' -> nums[i] = 10 * count;
                case 'L' -> nums[i] = 50 * count;
                case 'C' -> nums[i] = 100 * count;
                case 'D' -> nums[i] = 500 * count;
                case 'M' -> nums[i] = 1000 * count;
                default -> nums[i] = -1;
            }
        }

        int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if(i != nums.length-1 && nums[i] < nums[i+1]){
                    int tempsum = nums[i+1] - nums[i];
                    sum += tempsum;
                    i++;
                }
                else {
                    sum += nums[i];
                }
            }

        return sum;
    }
}