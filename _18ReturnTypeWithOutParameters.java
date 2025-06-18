//Return Type without Parameters

import java.util.Scanner;

public class _18ReturnTypeWithOutParameters {

    public static void main(String[] args){

        int results=ReturnTypeWithout();
        System.out.println("The sum is : "+results);
        System.exit(0);
    }

    public static int ReturnTypeWithout(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=a+b;
        return sum;
    }
}


