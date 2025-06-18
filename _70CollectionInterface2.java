//Collection Interface: Set

//Set: Rule:
// 1) set is a collection of unique values(Set won't allow duplicate values)
// 2) set values didn't give you the output in sorted format(HashSet)
//3) Sets don't have index value(set doent support indexvalue)

//import java.util.HashSet;
//import java.util.Set;
//
//public class _70CollectionInterface2 {
//    public static void main(String[] args){
//
//        Set<Integer> nums=new HashSet<Integer>();
//        nums.add(0);
//        nums.add(1);
//        nums.add(5);
//        nums.add(4);
//        nums.add(5);
//        nums.add(9);
//
//
//        System.out.println(nums);//doesn't print duplicate values
//
//        System.out.println(); //set dont have index value
//
//        //priniting indiuial value using loops
//
//       for(int n:nums){
//           System.out.println(n);
//       }
//
//
//
//
//    }
//}


//Example :2 to get sorted values we can use Tree-Set
// Tree-set extends abstractset and implements navigationset
//Then navigation set extends sorted set
//Instead of saying Set here we can say Collection because: Tree-set implements set and set extends collection. Ans collection extends iterable


//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
//
//public class _70CollectionInterface2 {
//    public static void main(String[] args){
//
//        Collection<Integer> nums=new TreeSet<Integer>();
//        nums.add(0);
//        nums.add(9);
//        nums.add(5);
//        nums.add(5);
//        nums.add(4);
//        nums.add(1);
//
//
//        System.out.println(nums);//doesn't print duplicate values
//
//        System.out.println(); //set dont have index value
//
//        //priniting indiuial value using loops
//
//        for(int n:nums){
//            System.out.println(n);
//        }
//
//
//
//
//    }
//}

//Instead os using for loop we can use iterator which implements collection

import java.util.*;


public class _70CollectionInterface2 {
    public static void main(String[] args) {

        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(0);
        nums.add(9);
        nums.add(5);
        nums.add(5);
        nums.add(4);
        nums.add(1);


        Iterator<Integer> values= nums.iterator(); //Using iterator to print the values
       //hasNext(): it checks whether the next values is present or not.
       // next() : it gives you the next Value.

        while(values.hasNext()){
            System.out.println(values.next());
        }


    }
}



