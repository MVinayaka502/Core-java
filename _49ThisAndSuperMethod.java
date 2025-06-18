/**
 * This(): this() is used to call the constructor of the same class
 *
 * Super(): Super method is default used even if we didn't explicitly mentioned.
 * The Usage of super() is to call the constructor of the super class
 * (if default super() means it will call default or zero paramterized.If we want to
 * acces parameterized it means we need to explicitly mention super() methoad pass the parameter in that like super(n).
 */

class a {
    //ZERO parameterized constructor
    public a(){
        System.out.println("In A (Zero parameterized constructor)");
    }

    //parameterized constructor
    public a(int a){
        System.out.println("In A (parameterized constructor)");
    }

    }


class b extends a {

    //Zero parametrized constructor
    public b(){
        super();// default is there .You can mention explicit.
        System.out.println("In B (Zero parameterized constructor)");
    }



    //Parametrized constructor
    public b(int a){
//        super(a);// we are passing a parameter .so that now super is called which have parameters
        // super with parameter is not default we should mention explicit.
        this();
        System.out.println("In B ( Parametrized constructor)");
    }

}


public class _49ThisAndSuperMethod {
    public static void main(String[] args){
        b obj=new b(5);


    }
}
