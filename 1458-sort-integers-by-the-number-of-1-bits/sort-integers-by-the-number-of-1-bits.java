class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] setBits = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.bitCount(arr[i]);
            setBits[i][0] = n;
            setBits[i][1] = arr[i];
        }

        Arrays.sort(setBits, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = setBits[i][1];
        }
        return arr;
    }
}