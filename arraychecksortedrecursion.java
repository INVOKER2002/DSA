public class arraychecksortedrecursion {
public static void main(String[] args) {
int[] arr={1,2,3,4,5,6,7,8,9,10};
    //program to check if array is sorted or not using recursion
    int k = check(arr,0);
    if(k==arr.length-1){
        System.out.println("sorted");
    }
    else{
        System.out.println("not sorted");
    }

}
static int count=0;
static int check(int[] arr,int start){
    if(start==arr.length-1 || arr[start]>arr[start+1]){
        return count;
    }
    if(arr[start]<=arr[start+1]){
        count++;
        check(arr,start+1);
    }
    return count;
}
}

