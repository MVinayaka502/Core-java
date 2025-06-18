//Write a program that calculates the factorial of a number using a while loop.
import java.util.Scanner;
public class _10FactorialNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int factorial=1; // intialized to 1


        while(n>=1){

            factorial=factorial*n;  // formula to calculate the factorial
            n--;

            // n=5;
            // 1*5 , n--
            // 1*4  , n--
            // 1*3 , n--
            // 1*2 , n--
            // 1*1 , n--
            // 5*4*3*2*1=120

        }


        System.out.println("The factorial is:");
        System.out.println(factorial);
    }
}
