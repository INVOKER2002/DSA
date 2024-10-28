public class printnumber {
    //prints numbers 1 to n using recursion 
    public static void main(String[] args){
        printnum(10);
    }
    static void printnum(int n){
        if(n==0)
        return;
        System.out.println(n);
        printnum(n-1);
    }
    
}
