public class productofdigits {
    public static void main(String[] args) {
        //product fo digits of a number using recursion
        int x = product(12345);
        System.out.println(x);
    }
    static int product(int n ){
         if(n<=1){
            return 1;
         }
         return n%10 * product(n/10);
    }
}
