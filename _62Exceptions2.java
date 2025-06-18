//Arithemetic exception

//
//public class _62Exceptions2 {
//    public static void main(String[] args){
//
//
//        int a=10;
//        int b=2;
//
//        try{
//            int c = a / b;
//            System.out.println(c);
//        }
//        // Here in place of e it can be anything e is just an object e they give to known its exception thats all
//
//        catch(Exception e){
//            // Also i want to print what the exception is about
//            System.out.println("Something goes WRONG....."+ e);
//        }
//
//
//        System.out.println("Program Terminated");
//
//
//    }
//}


//ArrayOutOfBound Exception
//
//public class _62Exceptions2 {
//
//    public static void main(String[] args){
//
//        int a[]={10,20,30,40,50};
//
//        try {
//            System.out.println(a[0]);
//            System.out.print(a[5]);
//            System.out.println(a[2]);// This line will not exceute because when exception occurs its stops and checks any exception handling is written or not
//
//        }
//        catch(Exception e){
//            System.out.println("Something Went Wrong.."+e);
//        }
//
//
//
//    }
//}


//Example 3: If we gave two or more exceptions in a try catch and at the end both the methods excute same catch block which is wrong right
//like 2/0 which is Airthemetic exception but in catch i gave for Array outofbounds which is not suitable right to the user because many times the input should give by the user
//To over come this issues we can write multiple catch blocks

//
//public class _62Exceptions2 {
//
//    public static void main(String[] args){
//
//        int a[]={10,20,30,40,50};
//
//        try {
////            int c=2/0;// see here if run this also it will give exception handler of Arrays which is wrong
//            int c=2/0;//You run this once normal and run once after commenting this line
//            System.out.println(a[0]);
//            System.out.print(a[5]);
//            System.out.println(a[2]);// This line will not exceute because when exception occurs its stops and checks any exception handling is written or not
//
//        }
//
////       we can use if else by giving conditions like e.Arithmetic Exception then print this like that
//       // Or we can use build in functions
//
//        catch(ArithmeticException e){
//            System.out.println("Something Went Wrong.."+e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Something Went Wrong.."+e);
//        }
//
//
//
//    }
//}



//Example 4: one new exception of string//NullPointerException


public class _62Exceptions2 {

    public static void main(String[] args){

        int a[]={10,20,30,40,50};
        String s=null;

        try {
//            int c=2/0;// see here if run this also it will give exception handler of Arrays which is wrong
//            int c=2/0;//You run this once normal and run once after commenting this line
            System.out.println(s.length()); // main Exception will occur as it accepts all exception
            System.out.println(a[0]);
            System.out.print(a[5]);
            System.out.println(a[2]);// This line will not exceute because when exception occurs its stops and checks any exception handling is written or not

        }

//       we can use if else by giving conditions like e.AirithmeticException then print this like that
        // Or we can use built in functions

        catch(ArithmeticException e){
            System.out.println("Something Went Wrong.."+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Something Went Wrong.."+e);
        }

        // But if any other exception occurs then what this two catch blocks will not excuete right
        //Its a good way of writing the catch

        catch (Exception e){
            System.out.println("Try Again ......"+e);
        }


    }
}








