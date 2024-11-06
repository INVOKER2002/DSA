import java.util.Scanner;
public class euclideanalgorithm {
    //program to find gcd or hcf of two numbers using euclidean algorithm 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a = sc.nextInt();
        System.out.println("enter number b");
        int b = sc.nextInt();
        System.out.println("hcf of the two numbers is  :  "+ factor(a,b));
    }
    static int factor(int a , int b)
    {
        //method to find highest common factor using euclidean algorithm
        if(a==0){
            return b;
        }
        return factor(b%a,a);
    }
    
}
