class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[][] matrix = new int[m][n];
        
        
        for (int z=0;z<indices.length;z++) {
            int r = indices[z][0];
            int c = indices[z][1];
            
            
            for (int j = 0; j < n; j++) {
                matrix[r][j]++;
            }
            
            
            for (int i = 0; i < m; i++) {
                matrix[i][c]++;
            }
        }
        

        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }
        
        return oddCount;
    }
}
