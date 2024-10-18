public class sieveoferatosthenes {
    //program to find all the prime numbers from 1 to n in n.log log n complexity
    //optimized algorithm
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n + 1];
        sieve(arr, n);
    }

    static void sieve(boolean arr[], int n) {
        for (int i = 2; i <= n; i++) {
            if (arr[i] == false) {
                for (int j = 2; j * i <= n; j++) {
                    arr[i*j]=true;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
    }
}
