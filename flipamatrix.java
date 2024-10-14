public class flipamatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{0,1,0},{1,1,0}};
        for(int i =0;i< arr.length;i++){
            for(int j =0;j<arr[i].length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1]=temp;
            }
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j]=arr[i][j]^1;
            }
        }
        //this program flips a matrix i.e reverses and then inverts it
        // leetcode question no 832
    }
}
