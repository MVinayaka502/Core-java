//Different types of printing values using loops


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class _73NeedOfStreamApi {
//    public static void main(String[] args){
//        List<Integer> nums= Arrays.asList(9,3,2,1,6,5);
//        //now from the nums i want only the even numbers and i want to double the even numbers and add the totatl double sum of the evn number
//        int sum=0;
//        //Using for each loop
//        for(int n:nums){
//            if(n%2==0){
//                n=n*2;
//                sum=sum+n;
//          }
//
//        }
//        System.out.println(sum);
//    }
//}



//
//Example 2: Using differnt types of loops to print the nums

public class _73NeedOfStreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 3, 2, 1, 6, 5);
        //now from thenums i want only the even numbers and i wnat to double the even numbers and add the totatl double sum of the evn number
        int sum = 0;
      //Method:1 using Regular for loop

//        for(int i=0;i<nums.size();i++){
//            System.out.println(nums.get(i));
//        }

        //Method 2: Using Enhance For loop

//        for(int n:nums){
//            System.out.println(n);
//        }

        //Using Method 3: Using for each loop

        nums.forEach(n->System.out.println(n));


    }
}



