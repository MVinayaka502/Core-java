//Write a method to check if a number is prime or not.
// A prime number is a number greater than 1 that is only divisible by 1 and itself.


import java.util.Scanner;
public class _15PrimeNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to check it is Prime Number or Not : ");
        int n=scan.nextInt();

        CheckPrime(n);
    }

    public static void CheckPrime(int n){


        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n<1){
                System.out.println("The number "+n+" is Not a Prime Number");
                break;
            }
            else if(n%i==0){
                System.out.println("The number "+n+" is Not a prime Number");
                break;
            }
            else{
                System.out.println("The Number "+n+" is a Prime Number");
                break;
            }

        }

        }




}

