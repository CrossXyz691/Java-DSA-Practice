class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
                int a=0;
        int b=image.length-1;
        for(int row=0;row<image[0].length;row++){
        
         int l=a;
         int r=image[row].length-1;
         while(l<r){
       int temp= image[row][l];
       image[row][l]=image[row][r];
       image[row][r]=temp;
       
       l++;
       r--;
        }
        }
        for(int row=0;row<image.length;row++){
            for(int col=0;col<image[row].length;col++){
                if(image[row][col]==1){
                    image[row][col]=0;
                }
                else{
                    image[row][col]=1;
                }
            }
        }
        return image;
    }
}