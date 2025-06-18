//Inner class Introduction

class A11{

    int age =23;
    public void show(){

        System.out.println("A in Show");
    }

    // Class Inside class
    class B1 {

        public void config(){
            System.out.println("Class B is accessed");
        }
            }
}

public class _56InnerClass
{
    public static void main(String[] args){

        // to access teh class A11 we can create an instance of the class A11 object and by the refernces we can access the class and its methods

        A11 aa=new A11();
        aa.show();

        // How to access the class B which is inner class of A11.

//        A11.B11 bb=new B1(); // even this will give you error because its only referining to the class b11
        // so you need to take the object of class A11 as follows.
        A11.B1 bb= aa.new B1();// This is the correct syntac to create objects of inner class

        bb.config();

    }
}
