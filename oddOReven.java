//this program checks whether the number is odd or even using the and operator 
//if we and any number with 1 we get the number itself 
import java.util.Scanner;
public class oddOReven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if((a&1)==1){
            System.out.println("number is odd ");
        }
        else{
            System.out.println("number is even");
        }
    }
}
