//Write a method to add two numbers and return the result.

import java.util.Scanner;
public class _12AddTwoNumbersUsingReturnMethod {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int results=TwoNumbers(a,b );
        System.out.println("The sum of "+a+" and "+b+" is : "+results);
        System.exit(0);

    }

     static int TwoNumbers(int a, int b){
        int sum=a+b;
        return sum;
    }


}
