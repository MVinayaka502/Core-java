//Encapsulation : using getter and setter

import java.util.Scanner;

class bank3{
    private int amt=50000;
    int pin=12345;// sets the pin value ex ATM or UPI

    //setter method
    public void setAmt(int p,int a){

        if(pin==p){
            amt=a;
        }
        else{
            System.out.println("Invalid Pin:Please Enter valid pin");
        }
    }

    //Getter method
    public int getAmt(int p){
        if(pin!=p){

            System.out.println("Invalid Pin :Please enter the valid pin");

        }

        return amt;
    }

}

public class _41Encapsulation4 {
    public static void main(String[] args){
        //creating  the instance of the class bank3
        bank3 b=new bank3();
//        System.out.println("Total Amount in the Account is : "+amt);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount to update : ");
        int a=scan.nextInt();
        System.out.println("Enter the pin :");
        int p=scan.nextInt();
        b.setAmt(p,a);
        System.out.println("The Updated Amount is : "+b.getAmt(p));

    }

}
