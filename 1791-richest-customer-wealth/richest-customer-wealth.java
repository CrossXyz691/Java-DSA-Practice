class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
    int a =0;
    for (int row = 0; row < accounts.length; row++) {
        int balance = 0;

        for (int col = 0; col < accounts[row].length; col++) {
            balance+=accounts[row][col];
        }
        if(balance > a) {
            a = balance;
        }

    }
    return a;
    }
}