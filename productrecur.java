
public class productrecur {

    public static void main(String[] args) {
        int x = product(5);
        System.out.println(x);
    }

    static int product(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * product(n - 1);
    }
}
