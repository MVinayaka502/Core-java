import java.util.Scanner;

// method:Return type with parameters

import java.util.Scanner;

public class _17ReturnTypeWithParameters {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1=scan.nextInt();
        int n2=scan.nextInt();

        int results=ReturnType(n1,n2);
        System.out.println("Addition of "+n1+" and "+n2+" is :"+results);
    }

    public static int ReturnType(int n1,int n2){
        int add=n1+n2;
        return add;
    }
}


