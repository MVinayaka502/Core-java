//Method Overloading

import java.util.Scanner;
public class _21MethodOverloading {
    public static void main(String[] args){

      SumMethod Sm=new SumMethod();
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the values : ");
//        int a=scan.nextInt();
//        int b=scan.nextInt();
//        int c=scan.nextInt();

        Sm.sumOf(10,20);
//        Sm.sumOf(10,20.0);
//        Sm.sumOf(20.0,10);
//        Sm.sumOf(5,5,5.5);
//        Sm.sumOf(5.5f,10.0);

    }
}

  class  SumMethod{
        void sumOf(int a,int b){
            System.out.println(a+b);
            System.out.println("  its int and int value");

        }
        void sumOf(int a,float b){
            System.out.println(a+b);
            System.out.println("  its int and float value");


        }
        void sumOf(float a,int b){
            System.out.println(a+b);
            System.out.println("its float and int value");
        }
        void sumOf(float a,double b){
            System.out.println(a+b);
            System.out.println("its float and double value");
        }

        void sumOf(double a, float b){
            System.out.println(a+b);
            System.out.println("its double and float value");
        }
        void sumOf(int a, double b){
            System.out.println(a+b);
            System.out.println("its int and double value");
        }

        void sumOf(int a, int b,double c){
            System.out.println(a+b+c);
            System.out.println("its int ,int and double value");
        }
        void sumOf(int a, float b, float c){
            System.out.println(a+b+c);
            System.out.println("its int ,float and float value");
        }
   }



