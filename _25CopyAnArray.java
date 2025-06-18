// copying an Array using three in-build methods in java

import java.util.Arrays;
import java.util.Scanner;

public class _25CopyAnArray {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] orginal_Arr={10,20,40,30,80,50};
        int[] copyArray=new int[orginal_Arr.length];

        //Method 1 using Loops

        for(int i=0;i<orginal_Arr.length;i++){
            copyArray[i]=orginal_Arr[i];
        }
        System.out.println("Using Method 1:Using Loops");
        System.out.println("The Original_array is : "+Arrays.toString(orginal_Arr));
        System.out.println("CopyArray is : "+ Arrays.toString(copyArray));// we can also use
        // loops to print out the copy array list


       // Method 2:

        System.out.println();
        System.out.println("Using Method 2:Inbuilt ");
        System.arraycopy(orginal_Arr,0,copyArray,0,orginal_Arr.length);
        System.out.println("The original_Array is : "+Arrays.toString(orginal_Arr));
        System.out.println("The copArray is : "+Arrays.toString(copyArray));

       //method 3

       int[] copyArray3=Arrays.copyOf(orginal_Arr,orginal_Arr.length);
       System.out.println();
       System.out.println("Using method 3: ");
       System.out.println("The original_array is : "+Arrays.toString(orginal_Arr));
       System.out.println("CopyArray is : "+Arrays.toString(copyArray3));


    }
}
