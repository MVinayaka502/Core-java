//Introduction to the stream APi and we explore differnt methods in StreamApi
// One of the best thing in StreamApi is it will not going to effect the nums(data)
//What i means is that if i have a nums=1+2 answer is 3 the nums values got changes but if we use StreamAPi nums value remains same

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream is a interface
 * it returns the Stream
 *
 */


//public class _75NeedOfStreamApi1 {
//    public static void main(String[] args){
//
//        List<Integer> nums = Arrays.asList(9, 3, 2, 1, 6, 5);
////        nums.forEach(n->System.out.println(n));
//        //If i use stream now and perform any operations it wont effect to the nums
//
//        Stream<Integer> s1=nums.stream(); //Now s1 is a stream which refers to the nums but i wont change or effect to the nums
//        //priting s1 using foe rach
//        s1.forEach(n->System.out.println(n));

//
//
////        s1.forEach(n->System.out.println(n)); //If i printed s.foreach method more than once i will get error of
//        // Error is stream has already been operated upon or closed
//
//        //stream in real life is like a flow once we used stram we cant reuse it
//
//
//
//    }
//}

//Example 2: Filters

//public class _75NeedOfStreamApi1 {
//    public static void main(String[] args){
//
//        List<Integer> nums = Arrays.asList(9, 3, 2, 1, 6, 5);
//
//
//        Stream<Integer> s1=nums.stream(); //Now s1 is a stream which refers to the nums but i wont change or effect to the nums
//        s1.forEach(n->System.out.print("s1 = "+n));
//        System.out.println();
//
//        //Example: Take even numbers from the num and double it and add th doubled value into teh sum and print the sum
//
//        Stream<Integer> s2=s1.filter(n->n%2==0); //s1 is used so we are taking s2
//        s2.forEach(n->System.out.println("s2 = "+s2));
//
//
//
//    }
//}



//Example 3:filters 1

//
//public class _75NeedOfStreamApi1 {
//    public static void main(String[] args){
//
//        List<Integer> nums = Arrays.asList(9, 4, 2, 8, 6, 5);
//
//
//        Stream<Integer> s1=nums.stream(); //Now s1 is a stream which refers to the nums but i wont change or effect to the nums
//        Stream<Integer> s2=s1.filter(n->n%2==0); //s1 is used so we are taking s2
//        Stream<Integer> s3=s2.map(n->n*2); // doubling the even number
//
//        s3.forEach(n->System.out.println(n));
//
//
//
//    }
//}

//Example 3: Applying reduce


//public class _75NeedOfStreamApi1 {
//    public static void main(String[] args){
//
//        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
//
//
//        Stream<Integer> s1=nums.stream(); //Now s1 is a stream which refers to the nums but i wont change or effect to the nums
//        Stream<Integer> s2=s1.filter(n->n%2==0); //s1 is used so we are taking s2
//        Stream<Integer> s3=s2.map(n->n*2); // doubling the even number
//        int results =s3.reduce(0,(c,e)->c+e);
//
////        s3.forEach(n->System.out.println(n));//// i cant use for each method for reduce because its only gives me one results unlike a loop
//
//        System.out.println(results);
//
//
//    }
//}



//Example 4: Reducing code of the above program using stream and lambda


public class _75NeedOfStreamApi1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println("Sum of even integers and doubled :"+result);

    }

}