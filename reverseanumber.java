
public class reverseanumber {

    public static void main(String[] args) {
        //reverse a number iteratively and recursively using two different functions
        reverseloop(12345);
        reverserecur(54321);
    }

    static void reverseloop(int n) { //reverse a number using loop
        int temp = 0;
        while (n != 0) {
            temp = temp * 10;
            temp = temp + n % 10;
            n = n / 10;
        }
        System.out.println(temp);
    }
    static int sum = 0;

    static void reverserecur(int n) {
        if (n == 0) {
            return;
        }
        sum = sum*10 + n%10;
        reverserecur(n / 10);
        System.out.println(sum);

    }
}
