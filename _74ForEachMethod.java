//Example 3: For each Method Exploration
//The main goal i fthis program is to how for each works internally
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class _74ForEachMethod {
//    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(9, 3, 2, 1, 6, 5);
//
//        //Using: Using for each loop
//        //As consumer is a interface we are writing Anonymous InnerClass
//
//
//        Consumer<Integer> cons=new Consumer<Integer>() {
//
//            public void accept(Integer n) {
//                //i can do whatever i want the operation
//                //But i just print for now
//
//                System.out.println(n);
//            }
//        };
//        nums.forEach(cons);
//
////        nums.forEach(n->System.out.println(n));
//
//    }
//}

//Example 2:

public class _74ForEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 3, 2, 1, 6, 5);

     //As consumer is a @functionalInterface we can use lambda
        Consumer<Integer> cons=( n) -> System.out.println(n);
        //Now pass the reference con
//        nums.forEach(cons);

        //or take right hand side

        nums.forEach(n->System.out.println(n));
        //This is the for each exploration how it works internally and how to decalre

    }
}