class Solution {
    public int diagonalSum(int[][] mat) {
         int n = mat.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
        
            primarySum += mat[i][i];

            
            secondarySum += mat[i][n - 1 - i];
        }

        System.out.println("Sum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
        
        
        int totalSum = primarySum + secondarySum;
        if (n % 2 != 0) {
            totalSum -= mat[n / 2][n / 2];
        }
        return totalSum;
    }
}
    
