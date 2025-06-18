//Write a program that takes a number and determines whether it is a perfect number.
//A perfect number is a number that is equal to the sum of its divisors (excluding the number itself).


import java.util.Scanner;

public class _6PerfectNumber {
    public static void main(String[] args){

//        int number=28;
        // Taking input from User
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check perfect number :");
        int number=sc.nextInt();

        int results=IsPerfectNumber(number); // calling method
        System.out.println();

        // printing the results
        if(results==number){
            System.out.println("The number "+number +" is a perfect number");
        }
        else{
            System.out.println("The number "+number +" is not a perfect number");
        }

    }

    // Declraing the method
    public static int IsPerfectNumber(int number){
        if(number<=0){
            System.out.println("The enter number is not a perfect number");
        }
        int count=0;
        for(int i=1;i<number;i++){
            // logic for perfect number;
            if(number%i==0){
                count=count+i; // count is defined to add/count the numbers which can divide the input
                System.out.print(i+" ");
            }

        }

      return count;
    }

// some perfect numbers for references
    // 6 , 28, 496, 8128

// example : (1*2*3)=6;
    //       (1+2+3=6)

}





