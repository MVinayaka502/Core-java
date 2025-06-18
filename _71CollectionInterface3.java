

/** Maps:
 * 1) Maps is not implementation or doesn't extend collection framework.Its a part of the collection API
 * 2) when you work with list of values 56,23,67 and 92. we need to work on the indexes right like 0,1.....
 * 3) Sometimes we value and pair want instead of using index values
 * 4) Map is a collection of key and value pair
 * Map itself is a interface
 * 5) it won't return sorted values
 * 6) key should be unique. values can be same no issues with that
 */


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//public class _71CollectionInterface3 {
//    public static void main(String[] args){
//        //the purpose of using here is instead of using index values we can use logical key value pair.
//        Map<String, Integer> students=new HashMap<>();
//        students.put("navin",56);//We dont have add method in maps
//        students.put("Vinay",89);
//        students.put("Lava",99);
//        students.put("Kishore",90);
//        //i want to update the marks of the student name navin
//        students.put("navin",98);// key value should be unique it only gives only one navin with updated marks
//
//
//        //
//
//        System.out.println(students);// prints entire output
////       System.out.println( students.get("navin"));//This is used to print indiviual value
//
//
//    }
//}


//Example : using loop to print all key values


//public class _71CollectionInterface3 {
//    public static void main(String[] args){
//        //the purpose of using here is instead of using index values we can use logical key value pair.
//        Map<String, Integer> students=new HashMap<>();
//        students.put("navin",56);//We dont have add method in maps
//        students.put("Vinay",89);
//        students.put("Lava",99);
//        students.put("Kishore",90);
//        //i want to update the marks of the student name navin
//        students.put("navin",98);// key value should be unique it only gives only one navin with updated marks
//
//
//    // we can use for loop here but in follow it will one value or iteration but in maps we have key value pair right
//        //So first get the details of the key names
//
//        System.out.println(students.keySet());//This will return all the keys names
//
//        //i can use for on keys
//        //us  can use key or anything for the naming just to understand we have used
//
//
//        for(String key:students.keySet())
//
//        {
//            System.out.println(key +" :"+students.get(key));
//        }
//
//
//    }
//}


//Example:Instead of using HashMap we are using HashTable

public class _71CollectionInterface3 {
    public static void main(String[] args){
        //the purpose of using here is instead of using index values we can use logical key value pair.
        Map<String, Integer> students=new Hashtable<>();
        students.put("navin",56);//We don't have Add method in maps
        students.put("Vinay",89);
        students.put("Lava",99);
        students.put("Kishore",90);
        //i want to update the marks of the student name navin
        students.put("navin",98);// key value should be unique it only gives only one navin with updated marks


        // we can use for loop here but in follow it will one value or iteration but in maps we have key value pair right
        //So first get the details of the key names

        System.out.println(students.keySet());//This will return all the keys names

        //i can use for on keys
        //us  can use key or anything for the naming just to understand we have used


        for(String key:students.keySet())

        {
            System.out.println(key +" :"+students.get(key));
        }


    }
}
//If multiple threads are running then use hapTable syncronizely