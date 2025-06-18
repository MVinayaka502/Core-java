//No Return Type Without parameters
import java.util.Scanner;
public class _20NoReturnTypeWithOut {
        public static void main(String[] args){


            NoReturnTypeWithout();
        }

        public static void NoReturnTypeWithout(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the number :");
            int a1 =scan.nextInt();
            int a2=scan.nextInt();
            int sum=a1+a2;
            System.out.println("The sum of "+a1+" and "+a2+" is : "+sum);
        }

}

