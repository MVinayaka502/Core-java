//Java 8 features: Lambda Introduction :lambda function works only with the functionalInterfsce

//@FunctionalInterface
//@FunctionInterface annotation allows only one method inside the interface
//
//interface demo{
//    public abstract void run();
//}
//
////class dum implements demo{
////
////    public void run(){
////        System.out.println("Running......");
////    }
////}
//
//
//public class _61Lambda1 {
//    public static void main(String[] args){
//
//
////        dum dd=new dum();
////        dd.run();// This is general
//
//        // What if i want use Anonymous inner class
//
//// Here we are not creating instance of interface which is not possible and also we created object of the anonymous calss
//
//        demo aa= new demo(){
//
//
//            public void run() {
//            System.out.println("Running.........");
//            }
//        };
//        aa.run();
//
//
//    }
//}




//Example 2: But as of now i know the
    // demo aa= new demo(){

/// /
/// /
/// /            public void run() {
/// /            System.out.println("Running.........");
/// /            }
/// /        };
/// /        aa.run();
///
// The above example i know that we need to create object then pass anonymous inner class all those how would compiler knows
// we can use lambda so taht the compiler knows about it and gives auto completion with reduction in code

//
//@FunctionalInterface
//
//interface demo{
//    public abstract void run();
//}
//
////class dum implements demo{
////
////    public void run(){
////        System.out.println("Running......");
////    }
////}
//
//
//public class _61Lambda1 {
//    public static void main(String[] args){
//
//
////        dum dd=new dum();
////        dd.run();// This is general
//
//        // What if i want use Anonymous inner class
//
//// Here we are not creating instance of interface which is not possible and also we created object of the anonymous calss
//
//        demo aa= ()-> {
//
//                System.out.println("Running......... Fanstaticly");
//        };
//        aa.run();
//
//
//    }
//}





////Example 3: What i sthe method run takes input how we do using lambda
//
//
//@FunctionalInterface
//
//interface demo{
//    public abstract void run(int i);
//}
//
////class dum implements demo{
////
////    public void run(){
////        System.out.println("Running......");
////    }
////}
//
//
//public class _61Lambda1 {
//    public static void main(String[] args){
//
//
////        dum dd=new dum();
////        dd.run();// This is general
//
//        // What if i want use Anonymous inner class
//
//// Here we are not creating instance of interface which is not possible and also we created object of the anonymous calss
//
////        demo dd= (int i)->
////        // even  don't need to mention the data type becuase as it already mentioned inside the method in interface
//
////            demo aa=(i)->
//        //Even if we have only one data type or input we dont need paranethisis
//            demo dd=i->
//            {
//            System.out.println("Running......... Fanstaticly  : " +i);
//        };
//        dd.run(5);
//
//
//    }
//}



//Example 3:what if method inside run() which have return value and have two values


@FunctionalInterface

interface demo{
    public abstract int run(int i,int j);
}

//class dum implements demo{
//
//    public void run(){
//        System.out.println("Running......");
//    }
//}


public class _61Lambda1 {
    public static void main(String[] args){



//        demo dd=(int i, int j)->{
//
//
//                System.out.println("Running..............");
//                return i+j;
//
//
//        };

        // or u can write

        demo dd=(i,j)->i+j;

       int results= dd.run(4,2);
        System.out.println("i+j == "+results);


    }
}



























