// Static block:
// Multiple Static block and we can declare static variables inside static block

class Test01{


    // Declaring multiple static block and also we can declare static variables inside the static blocks
  static{
      System.out.println("AWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
    }




    static
    {
         int a=10,b=20      ;
        System.out.println("Inside static 1 blocks");
        System.out.println("a and b = "+a+"  "+b);// not exceuted why?
    }
    static{
        System.out.println("Its second static block");
    }
    static void func1(){

        System.out.println("Inside the static methods");
    }
}
public class _46Static2 {
    public static void main(String[] args){
        Test.func1();

        // JVM access first static variable and then stores the default values then
        //it looks for static block
    }
}
