//Write a Java program that takes two integers as input from the user and prints their sum.
import java.util.Scanner;

import static java.lang.System.exit;

public class _4SumOfTwoInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Integer Value: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("The sum of two numbers is :"+(n1+n2));
        exit(0);

    }
}
