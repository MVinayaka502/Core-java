//Write a method that takes an integer and returns its square.
import java.util.Scanner;
public class _14SquareWithReturn {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the integer value: ");
        int a=scan.nextInt();
        int results=SquareInteger(a);
        System.out.println("The square of "+a+" is : "+results);
    }

    public static int SquareInteger(int a){
        int sq=a*a;
        return sq;
    }

}
