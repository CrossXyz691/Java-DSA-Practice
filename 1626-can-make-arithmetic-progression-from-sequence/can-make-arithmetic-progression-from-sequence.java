class Solution {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        boolean ArtmPrg = false;

        for (int i = 0; i < arr.length-1; i++) {
            ArtmPrg = false;
            int check = arr[i+1] - arr[i];
            if(d == check){
                ArtmPrg = true;
            }
            if(!ArtmPrg){
                break;
            }
        }
        boolean ArtmPrgR = false;
        d = arr[arr.length-1] - arr[arr.length-2];
        for (int i = arr.length-1; i > 0; i--) {
            ArtmPrgR = false;
            int check = arr[i] - arr[i-1];
            if(check == d){
                ArtmPrgR = true;
            }
            if(!ArtmPrg){
                break;
            }
        }
        if (ArtmPrgR == ArtmPrg == true){
            return true;
        }
        else{
            return false;
        }
    }
}