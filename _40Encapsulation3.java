//Encapsulation 3: using Getter and setter method
import java.util.Scanner;

 class bank2 {
     private int amt = 50000; // setting the amount as private
     int pin = 12345;

     //Setter Method

     void setAmt(int p, int a) {
         if (p == pin) {
             amt = a;
         }
         else {
             System.out.println("Invalid PIN: Please Enter the valid PIN");
             System.exit(0);
         }
     }

     //getter method

     int getAmt(int p) {
         if (pin != p) {
             System.out.println("Invalid PIN ");
             System.exit(0);
         }

         return amt;
     }
 }

 class _40Encapsulation3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the amount to set : ");
        //Enter the amount to set
        int a=scan.nextInt();
        // Enter the correct pin
        System.out.println("Enter the pin : ");
        int p=scan.nextInt();

        bank2 b = new bank2(); // creating a instance of class bank2
        b.setAmt(p,a);
        int UpdatedAmt=b.getAmt(p);
        System.out.println("The updated amount is : "+UpdatedAmt);

    }
}
