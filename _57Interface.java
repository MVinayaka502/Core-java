//Abstraction can be done using Interfaces in java
//interface is not a class. and by default every method in interface it is public and abstract
// we cannot instantant of interface just like abstract


interface plane11{
    // can i declared varibales inside interface? yes you can.

    //All the variables inside the interface are final and static defaultly
    //Final means we need to intialilized
    int a=22;
    String name="Vinay";


   abstract public void show();// abstract public are default
    public void config();



}
 class Ab implements plane11{
    // Now we implemented interface or abstract we need to complusorly take the both methods or else
     //if u miss any method By defaulty ur class also become abstract class
    public void show(){

        System.out.println("Shows in AB");
    }


    public void config() {

        System.out.println("config is exuted");

    }
}



public class _57Interface{

    public static void main(String[] args){

//    plane11 obj;

//    obj =new A();// we cannot instance object to interface


        //the interface give you the method or path or design to do something it will not implement .Its respobility of the class to implement


        //Now i have been implemented class plane1 i will instantce the class Ab

        Ab obj1=new Ab();
        obj1.show();
        obj1.config();

        // As we known vairables inside interface are final and static it means in static variables, methods and classes are accessed without creating the instance of the classes

            System.out.println(plane11.name);
            System.out.println(  plane11.a);



    }

}