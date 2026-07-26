class Solution {
    public int[] frequencySort(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            i+=count-1;
            temp.add(count);
            ans.add(temp);
        }

        ans.sort((list1, list2) -> {
            int compareSecond = Integer.compare(list1.get(1), list2.get(1));
            if (compareSecond != 0) {
                return compareSecond;
            }
            return Integer.compare(list2.get(0), list1.get(0));
        });
        int checker = 0;
        int a = 0;
        for (int i = 0; i < ans.size(); i++) {
            int stop = ans.get(i).get(1);
            int num = ans.get(i).get(0);
            for (int k = a; k < stop+a; k++) {
                nums[k] = num;
            }
            if(checker != 0){
                a = a+stop;
            }
            else{
                a = stop;
            }
            checker++;
        }
        return nums;
    }
}