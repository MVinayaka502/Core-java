// static introduction

class Test {

    // Declaring static variable,block and method.
    static int a, b; // static variable.

    // static block
    static {
        System.out.println("Inside static block");
    }

    //static Method.
    static void func1() {
        System.out.println("Inside static method");
    }



    //Declaring Instance variable,block and Methods.

    int x, y;
   // instant block .(for static we need to mention block as static before opening the flower brace)

    {
        System.out.println("Inside Instant Block");
    }

    // instant method( Because it's declared inside the class and outside main method).
    void func2() {
        System.out.println("Inside Instant Method");
    }



    //Declaring Constructor(The name of the constructor should be same as the class name).


    Test(){
        System.out.println("Inside the constructor");
        x=30;
        y=80;
        System.out.println("x and Y is : "+x +" and "+y);
    }
}


public class _45StaticIntroduction {
    public static void main(String[] args){

        Test.func1(); // to access the static method(the rule is methods cant execute itself even it is static we need to call)
        Test t=new Test();
        t.func2();


    }
}
