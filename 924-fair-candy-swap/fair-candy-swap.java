class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceShare = 0;
        int bobShare = 0;

        int aliceSum = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            aliceSum+=aliceSizes[i];
        }

        int bobSum = 0;
        for (int i = 0; i < bobSizes.length; i++) {
            bobSum +=bobSizes[i];
        }

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                int finalAliceSum = aliceSum - aliceSizes[i];
                int finalBobSum = bobSum - bobSizes[j];
                if(finalAliceSum - finalBobSum == aliceSizes[i] - bobSizes[j]){
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}