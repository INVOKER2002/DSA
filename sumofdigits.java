public class sumofdigits {
    public static void main(String[] args) {
        //sum of digit of a number using recursion in java 
        int x = digit(1234567);
        System.out.println(x);
    }
    static int digit(int n ){
        if(n==0){
            return 0;
        }
        int d = n %10;
        return d + digit(n/10);
    }
}
