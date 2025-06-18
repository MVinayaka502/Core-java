//Write a program to check if a given year is a leap year.
// (A year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.)

import java.util.Scanner;
public class _8LeapYear {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)|| (year%400==0)){
            System.out.println("The year "+"year "+"is a Leap Year");
        }
        else{
            System.out.println("The entered year "+year+" is NOT a Leap Year");
        }

    }
}

// some examples of leap years
// 2000 , 2020 , 2024, 2028