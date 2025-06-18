// Variable shadowing

public class _42variableShadowing {

    public static void main(String[] args){
        Print p=new Print();
        int a=10;
        System.out.println("local Variable = "+a);
        //If the instance variable and local variable have same name.
        // whenever you print (access) it in the method.The value of the
        // local variable will be printed (shadowing the instance variable).
        // If you still, need to access the values of instance variables
        // in a method you need to access them using this keyword (or object).
        System.out.println(" Instance Variable = "+p.a);

    }
}

 class Print{

    int a=20;
    int b;

}
