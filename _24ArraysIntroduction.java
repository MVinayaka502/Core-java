// Arrays introduction

import java.util.Scanner;

public class _24ArraysIntroduction {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array : ");

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("The array is : ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.exit(0);
    }
}
