//No Return Type With Parameters

import java.util.Scanner;

public class _19NoReturnTypeWithParameters {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a=scan.nextInt();
        int b=scan.nextInt();

        NoReturnTypeWith(a,b);
    }

    public static void NoReturnTypeWith(int a,int b ){
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is : "+sum);
        System.exit(0);

    }
}
