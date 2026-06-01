class Solution {
    public int diagonalSum(int[][] mat) {
         int n = mat.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal condition: row == col
            primarySum += mat[i][i];

            // Secondary diagonal condition: col = n - 1 - row
            secondarySum += mat[i][n - 1 - i];
        }

        System.out.println("Sum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
        
        // Optional: Total sum of both diagonals combined
        // If 'n' is odd, the central element is counted twice, so we subtract it once.
        int totalSum = primarySum + secondarySum;
        if (n % 2 != 0) {
            totalSum -= mat[n / 2][n / 2];
        }
        return totalSum;
    }
}
    
