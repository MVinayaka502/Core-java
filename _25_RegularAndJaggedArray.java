// Regular and Jagged Array in java

import java.util.Scanner;
import java.util.Arrays;

public class _25_RegularAndJaggedArray {
    public static void main(String[] args){

//        // declaring the regular 2D array
//
//        int[][] nums=new int[3][4];
//
//        // i am not taking inputs from user i just using math.random inbuilt method to generate some random values.
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 nums[i][j]=(int)(Math.random() *10);
//
//             }
//
//         }
//
//         // Printing the output using for loop
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.print(nums[i][j] +" ");
//            }
//            System.out.println();
//        }

//        // printing the output using Enhanced for loops
//
//        for(int n[]:nums){
//            for(int m:n){
//                System.out.print(m +" ");
//            }
//            System.out.println();
//        }









//
//        //Declaring 2D Jagged Array (internal arrays have different values)
//
//        int[][]nums=new int[3][];//not sure about coloumns
//        // need to specify the first value as mentioned as 3 as number of rows
//
//        // declaring the colomns
//        nums[0]=new int[3];
//        nums[1]=new int[4];
//        nums[2]=new int[2];
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//
//                nums[i][j]=(int)(Math.random()*10);
//            }
//        }
//
//        // Printing the output using Enhanced for loop
//
//        for(int n[]:nums){
//            for(int m:n){
//                System.out.print(m +" ");
//            }
//            System.out.println();
//        }
//
//








        // 3D Jagged Array
        int[][][] nums=new int[2][3][];
        // let us assume 2 as school, 3 classrooms and last one is students

        nums[0][0]=new int[2];// it means in school 0, classroom 0 there are 2 students.
        nums[0][1]=new int[3];
        nums[0][2]=new int[2];
        nums[1][0]=new int[4];
        nums[1][1]=new int[1];
        nums[1][2]=new int[2];



        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
            for(int k=0;k<nums[i][j].length;k++){

                nums[i][j][k]=(int)(Math.random()*10);

            }

            }
        }

        // printing the 3d output

        for(int n[][]:nums){
            for(int m[]:n){
                for(int o:m){
                    System.out.print(o+" ");
                }
                System.out.println();
            }
        }





    }
}
