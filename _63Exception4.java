// Custom(Own or My) Exception Introduction

// If want my own exception i need to create a class of myexcetion
// but it won't a exception class right its just a normal class then
// how you differentiate that is exception
//The answer is i inherit or take from my parent(class)

//Custom Exception class
class MyException extends Exception{

    //This is a constructor
    public  MyException(String s){

         super(s);

    }

}

public class _63Exception4 {
    public static void main(String[]args){
        int i=18;
        int j=0;

        try{

            j=i/20; // this gives value 0.9 but its intger so its 0.

            if(j==0) {
                //Even this is an object
                throw new MyException("I don't want to print Zero okay");
            }

        }

        catch (MyException e){

            System.out.println(" My OWn Exception is Executed:" + "" + "" );
            System.out.println(e);

        }


        catch(ArithmeticException e){
            j=18;//Assigning Default value
            System.out.println("This is the default value.....  "+e);


        } catch (Exception e) {
            System.out.println("Default catch block");
        }


    }
}

