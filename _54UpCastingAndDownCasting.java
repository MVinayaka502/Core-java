//upcasting and downcasting
class A1{
    public void show1(){
        System.out.println("In A1 show");
    }
}

class B1 extends A1{
    public void show2(){
        System.out.println("In B1 show");
    }
}
public class _54UpCastingAndDownCasting {
    public static void main(String[] args){

//        A1 obj =new A1();
//        obj.show1();
//        obj.show2();// A1 obj is a reference of class A1 and it does'nt know whether class B1 exists or not.

//but to access it using same object we can use dynamic method dispatch used in polymorphism



        A1 obj =new B1(); // up-casting
        obj.show1();



//        B1 obj1=obj;// here we will get error because obj is of reference A1 but we are assigning to the B1 obj1

        B1 obj1=(B1)obj;// down-casting
        obj1.show2();



    }
}
