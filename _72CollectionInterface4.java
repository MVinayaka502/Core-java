//   Sorting Using Comparator vs comparable
//   Comparator is @functionalInterface

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//
//public class _72CollectionInterface4 {
//    public static void main(String[] args){
//
//     List<Integer> studs=new ArrayList<>();   //  the new update is ist no mandotory to write Integer on the right side
//     //left hand should write complusorly.
//
//
//     studs.add(4);
//     studs.add(7);
//     studs.add(3);
//     studs.add(6);
//     studs.add(0);
//
////How to sort the values now
//        //using collection class
//        Collections.sort(studs);//This will sort
//        System.out.println(studs);
//
//
//    }
//}




//When we want to sort on our own logic like i want sorting according to the last digit like
// Example: 41,64,52,80  no i want to sort based on the last digit
// output=80,41,52,64
// like this we can achieve Using  Comparator vs comparable
/**
 * Comparatory is a interface : we can implement interface in multiple ways 1) is we can create a class and implements interface or
 * We can use Anonymous inner class
 * Comparator is a interface used to build your own logic for the sorting
 */


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//
//public class _72CollectionInterface4 {
//    public static void main(String[] args){
//        //Comaprator is a interface we can implement using class extends or using Anonymous InnerClass
//        //Collections works with the wrapper classes not with the numbers
//        Comparator<Integer> com=new Comparator<Integer>() {
//
//            public int compare(Integer i, Integer j) {
//
//                //Write your own logic for sorting
//                //To get last digit in the number we can use %10
//
//                // the logic os how we sort numbers we first take two numbers then sort them and we comapre 2nd and third digit and so on right
//                //The main thing arises for my logic when should swap
//                // when suppose i(45)%10 > j(40)%10 swap it means think we got output as 5 and 4 this are teh last digit we can swalp
//                //return 1 means swap .return -1 means no swap
//
//                if(i%10 >j%10){
//                    return 1;}
//               else{
//                   return -1;}
//                }
//
//        };
//
//        List<Integer> studs=new ArrayList<>();   //  the new update is ist no mandotory to write Integer on the right side
//        //left hand should write complusorly.
//        studs.add(45);
//        studs.add(74);
//        studs.add(32);
//        studs.add(60);
//        studs.add(01);
//
////How to sort the values now
//        //using collection class
//        Collections.sort(studs,com);//i need to call the numbers and logic for sorting right
//        System.out.println(studs);
//
//
//    }
//}



//Example 3: i will take input as String values in previous i took Integers

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class student{
//    String name;
//    int age;
//
//    public student(int age,String name) {
//        this.age = age;
//        this.name=name;
//    }
//
//    public String toString() {
//        return "student{" + ", age=" + age + '\'' + "name='" + name + '}';
//    }
//}
//
//public class _72CollectionInterface4 {
//    public static void main(String[] args){
//        //Comaprator is a interface we can implement using class extends or using Anonymous InnerClass
//        //Collections works with the wrapper classes not with the numbers
//        Comparator<student> com=new Comparator<student>() {
//
//            public int compare(student i, student j) {
//
//                //Write your own logic for sorting
//                //I want to sort based on the age
//
//                if(i.age>j.age){
//                    return 1;//swap
//                }
//                else{
//                    return -1; //No swap
//                }
//
//
//            }
//        };
//
//        List<student> studs=new ArrayList<>();   //  the new update is ist no mandatory to write Integer on the right side
//        //left hand should write complusorly.
//        studs.add(new student(21,"Navin"));
//        studs.add(new student(24,"Vinay"));
//        studs.add(new student(20,"lava"));
//        studs.add(new student(22,"chimp"));
//        studs.add(new student(18,"bob"));
//
////How to sort the values now
//        //using collection class
////        Collections.sort(studs);//i need to call the numbers and logic for sorting right
////        System.out.println(studs);//This gives you results but not in format so use loop
//
//    //calling the comparator for sorting here
//        Collections.sort(studs,com);
//
//        for(student s:studs){
//            System.out.println(s);
//
//        }
//
//        //Now i want to sort the stud values based on there age
//
//
//    }
//}



//Using Comparable : because Integers class implements comparable thay why sort works with integers
//BUt student not implementing comparanle automatically we need to call

//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class student implements Comparable<student>
//{
//    String name;
//    int age;
//
//    public student(int age,String name) {
//        this.age = age;
//        this.name=name;
//    }
//
//    public String toString() {
//        return "student{" + ", age=" + age + '\'' + "name='" + name + '}';
//    }
//
//
//    public int compareTo(student that) {
//
//        //why that is used means i am giving powers to compare him with others see when we want to compare two students we need third person to compare right
//        //But here i am telling to student to compare you with others so that means student himself who is comapring and this means any other students pointing on
//
//
//        if(this.age>that.age){
//            return 1;//swap
//        }
//        else{
//            return -1; //No swap
//        }
//    }
//}
//
//public class _72CollectionInterface4 {
//    public static void main(String[] args){
//        //Comaprator is a interface we can implement using class extends or using Anonymous InnerClass
//        //Collections works with the wrapper classes not with the numbers
////        Comparator<student> com=new Comparator<student>() {
////
////            public int compare(student i, student j) {
////
////                //Write your own logic for sorting
////                //I want to sort based on the age
////
////                if(i.age>j.age){
////                    return 1;//swap
////                }
////                else{
////                    return -1; //No swap
////                }
////
////
////            }
////        };
//
//        List<student> studs=new ArrayList<>();   //  the new update is ist no mandatory to write Integer on the right side
//        //left hand should write complusorly.
//        studs.add(new student(21,"Navin"));
//        studs.add(new student(24,"Vinay"));
//        studs.add(new student(20,"lava"));
//        studs.add(new student(12,"chimp"));
//        studs.add(new student(18,"bob"));
//
////How to sort the values now
//        //using collection class
////        Collections.sort(studs);//i need to call the numbers and logic for sorting right
////        System.out.println(studs);//This gives you results but not in format so use loop
//
//        //calling the comparator for sorting here
////        Collections.sort(studs,com);//This is for comparartor
//        //but i want comparable
//        Collections.sort(studs);//This is for comparable:this will sort
//
//        for(student s:studs){
//            System.out.println(s);
//
//        }
//
//        //Now i want to sort the stud values based on there age
//
//
//    }
//}
//Simply : if u want to compare two students then use comparable
//if third is comparining then use comparator.




//Comaparator is @functionalInterface so we can apply lambda to reduce the code

//Example 4: lets try with comparartor as it is @functionalInterface



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student {
    String name;
    int age;

    public student(int age,String name) {
        this.age = age;
        this.name=name;
    }

    public String toString() {
        return "student{" + ", age=" + age + '\'' + "name='" + name + '}';
    }

}

public class _72CollectionInterface4 {
    public static void main(String[] args){
        /**
         *  Comaprator is a interface we can implement using class extends or using Anonymous InnerClass
         *  Collections works with the wrapper classes not with the numbers
         */
        //Using lambda for comparator only

        Comparator<student> com= ( i, j)-> {return i.age > j.age?1:-1;};

            //since we have only one statement we dont want return and brackets
               //using ternary operator


        List<student> studs=new ArrayList<>();   //  the new update is ist no mandatory to write Integer on the right side
        //left hand should write complusorly.
        studs.add(new student(21,"Navin"));
        studs.add(new student(24,"Vinay"));
        studs.add(new student(20,"lava"));
        studs.add(new student(22,"chimp"));
        studs.add(new student(18,"bob"));
        Collections.sort(studs,com);//This is for comparable:this will sort
        for(student s:studs){
            System.out.println(s);

        }

    }
}


