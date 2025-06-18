//Abstract  And  Anonymous Inner Class

//It's only for one method in abstract class
abstract class AA1{

    abstract public void show();

}
// Commented because to applying this using anonymous inner class.
// Class BB1 extends AA1{
//
//    public void show(){
//        System.out.println("Show in Class BB1");
//    }
//
//}


public class _56AbstractAndAnonymousInnerClass {
    public static void  main(String[] args){

//        AA1 aa=new AA1();// of course we get error here because we can create a object for the abstract class and class AA1 is abstrct
        //so we need to write another class and inherit the class AA1

        //To access AA1 we need to create an object of class B11
        // And here in class A11 of method show() is abstracted and wants to hide details
//        BB1 bb=new BB1();
//        bb.show();

        //But i using only once the class BB1 so i will use anonymous inner class

        // Here u can observe that we created a objected of class AA1 it should show error right because we cant create object of a abstract class then why here no error means
        //Here we are creating object of Anonymous inner class
        AA1 aa =new AA1(){

            public void show(){
                System.out.println("Show in BB1");
            }

        };
        aa.show(); // calling
    }
}
