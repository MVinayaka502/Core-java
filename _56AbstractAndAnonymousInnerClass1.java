//Abstract  And  Anonymous Inner Class

//Here two method in abstract class
abstract class AA111{

    abstract public void show();
    abstract public void config();

}
// commented because to applying this using anonymous inner class.
//class BB11 extends AA11{
//
//    public void show(){
//        System.out.println("Show in Class BB11");
//    }
//
//}


public class _56AbstractAndAnonymousInnerClass1 {
    public static void  main(String[] args){

//        AA11 aa=new AA11();// of course we get error here because we can create a object for the abstract class and class AA1 is abstrct
        //so we need to write another class and inherit the class AA1

        //To access AA1 we need to create an object of class B111
        // And here in class A111 of method show() is abstracted and wants to hide details
//        BB11 bb=new BB11();
//        bb.show();

        //But i using only once the class BB1 so i will use anonymous inner class

        // Here u can obsereve that we created a objected of class AA1 it should show error right because we cant create object of a abstract class then why here no error means
        //Here we are creating object of Anonymous inner class
        AA111 aa =new AA111(){

            public void show(){
                System.out.println("Show in BB11");
            }

            public void config(){
                System.out.println("Config exceuted");
            }

        };
        aa.show();
        aa.config();// calling
    }
}
