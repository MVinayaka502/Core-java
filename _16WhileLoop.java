//Usage of while loop

//public class _16WhileLoop {
//    public static void main(String...args){
//
//        int i=0;
//        while(i<10){
//            System.out.println(i);
//            i++;
//        }
//
//    }
//
//}


    // Do wile loop



//public class _16WhileLoop{
//    public static void main(String[] args){
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<10);
//    }
//}


    //Switch statements


import java.util.Scanner;
public class _16WhileLoop{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number from 1-4: ");
        int n1=scan.nextInt();
        switch(n1){
            case 1:System.out.println("Entered number is : 1");break;
            case 2:System.out.println("Entered number is : 2");break;
            case 3:System.out.println("Entered number is : 3");
                break;
            case 4:System.out.println("Entered number is : 4");break;
        }
    }
}