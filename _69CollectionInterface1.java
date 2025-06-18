//CollectionApi is a;so called collection framework
//Collection is the interface

//Example :ArrayList interface
//lIST Supports duplicate values
//
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class _69CollectionInterface1 {
//    public static void main(String[] args){
//
//        //Need to create the object of the List(ArrayList)
////<Integer> This is a genrix concept
//        ArrayList<Integer> nums=new ArrayList<Integer>();
//        nums.add(1);//Arraylist are the objects not numbers
//        nums.add(3);
//        nums.add(8);
//        nums.add(9);
//        nums.add(3);
////        nums.add("55"); if we didnt mention Integer in the line 16 we don't get compilation error but while performing theoperations to that we get runtime error so we use Integer
////The jvm will tell u or suggest the errors
//
//        //To print indiviuial values we don't have index values here so
//
//        for(int n:nums){
//            System.out.println(n);
//        }
//
//        //As you remenber in Array we use loops to print the Array but in collections we don't need .we can directly print in collection Api
//        System.out.println(nums);
//
////To get index value of list we can use get method
//
//        System.out.println("Index value:" +nums.get(3));
//
//        //To print index value
//        System.out.println("Index of "+nums.indexOf(9)); //returns index value of value 9
//
//
//    }
//}



//Example 4: Another way of taking inputs


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class _69CollectionInterface1 {
    public static void main(String[] args){

        //Need to create the object of the List(ArrayList)
//<Integer> This is a genrix concept
        List<Integer> nums= Arrays.asList(4,5,6,7,8);

//        nums.add("55"); if we didnt mention Integer in the line 16 we don't get compilation error but while performing theoperations to that we get runtime error so we use Integer
//The jvm will tell u or suggest the errors

        //To print indiviuial values we don't have index values here so

        for(int n:nums){
            System.out.println(n);
        }

        //As you remenber in Array we use loops to print the Array but in collections we don't need .we can directly print in collection Api
        System.out.println(nums);

//To get index value of list we can use get method

        System.out.println("Index value:" +nums.get(3));

        //To print index value
        System.out.println("Index of "+nums.indexOf(9)); //returns index value of value 9


        


    }
}


