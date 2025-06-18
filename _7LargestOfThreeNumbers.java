//Write a program to find the largest of three numbers using if-else statements.


import java.util.Scanner;

public class _7LargestOfThreeNumbers {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("The number "+n1+" is the largest number");
        }
        else if(n2>n1 &&n2>n3){
            System.out.println("The number "+n2+" is the largest number ");
        }
        else if(n1==n2 && n2==n3){
            System.out.println("The values of n1,n2 and n3 are equal");

        }
        else{
            System.out.println("The number "+n3 +" is the largest number");
        }

    }
}
