class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> p = new ArrayList<>();

        List<Integer> up = new ArrayList<>(candidates.length);

        for (int num : candidates){
            up.add(num);
        }

        return combination(p, up, target);
    }

    static List<List<Integer>> combination(List<Integer> p, List<Integer> up, int target){
        int sum = sum(p);
        if(sum > target){
            return Collections.emptyList();
        } else if(sum == target){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(p));
            return result;
        } else if(up.isEmpty()){
            return Collections.emptyList();
        }

        int n = up.get(0);

        List<Integer> temp = new ArrayList<>(p);
        temp.add(n);

        List<Integer> temp1 = new ArrayList<>(up);
        temp1.remove(0);

        List<List<Integer>> l = combination(temp, up, target);
        List<List<Integer>> r = combination(p, temp1, target);

        List<List<Integer>> ans = new ArrayList<>(l);
        ans.addAll(r);
        return ans;
    }

    static int sum(List<Integer> nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }
}