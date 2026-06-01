class Solution {
    public int diagonalSum(int[][] mat) {
         
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < mat.length; i++) {
        
            primarySum += mat[i][i];

            
            secondarySum += mat[i][mat.length - 1 - i];
        }

        
        
        
        int totalSum = primarySum + secondarySum;
        if (mat.length % 2 != 0) {
            totalSum -= mat[ mat.length/ 2][ mat.length/ 2];
        }
        return totalSum;
    }
}
    
