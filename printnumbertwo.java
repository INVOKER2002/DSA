public class printnumbertwo {
    public static void main(String[] args) {
        //prints numbers 1 to n using recursion 
        printnum(10,1);
    }
static void printnum(int n,int k ){
    if(k==n+1)
    return;
    System.out.println(k);
    printnum(n,k+1);
}
}
