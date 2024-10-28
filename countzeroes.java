
public class countzeroes {

    public static void main(String[] args) {
        //count the number of zeroes in a number using recursion
        int k = count(4123012);
        System.out.println(k);
    }
    static int c = 0;

    static int count(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 0) {
            c++;
        }
        count(n / 10);
        return c;
    }
}
