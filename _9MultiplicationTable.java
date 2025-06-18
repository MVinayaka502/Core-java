//Write a program to print the multiplication table of a number using a for loop.

//import java.util.Scanner;
//
//public class _9MultiplicationTable {
//
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the table number(1-20) :");
//        int table=sc.nextInt();
//        int n=10;
//        System.out.println("The table is: ");
//        for(int i=1;i<=n;i++){
//            int res=table*i;
//            System.out.println(table +" * "+i+" ="+res);
//        }
//    }
//}

// just for practice

import java.util.Scanner;

public class _9MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number : ");
        int table_no=sc.nextInt();
        int n=10; // table length
        System.out.println("The table "+table_no+" is below :");

        // using for loops

        for(int i=1;i<=n;i++){
            int res=table_no*i;
            System.out.println(table_no+" * "+i+" = "+res);
        }



    }
}