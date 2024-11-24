import java.util.Scanner;
public class kadanes {
    //program for kadanes algorithm for maximum subarray sum 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("enter the value of array element at "+ i);
            arr[i]=sc.nextInt();
        }
System.out.println("maximum subarray sum is "+maxsubsum(arr));
sc.close();
    }
    static int maxsubsum(int[] arr){
int max = Integer.MIN_VALUE;
int curmax =0;
for(int i = 0;i<arr.length;i++){
    curmax=curmax+arr[i];
    if(curmax>max){
        max=curmax;
    }
    if(curmax<0){
        curmax=0;
    }
}
return max;
    }
}
