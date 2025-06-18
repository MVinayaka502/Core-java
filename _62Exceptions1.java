//Exception introduction


public class _62Exceptions1 {
    public static void main(String[] args){

//        int a=10;
//        int b=2;
//
//        int c=a/b;
//        System.out.println(c);
        //This works well but


//        int a=10;
//        int b=0;
//        int c=a/b;
//        System.out.println(c);
//        //As you see no compilation error but while running it will get runtime error

        //When think something can get exception or runtime errors in the code we can code that inside a block as shown

        int a=10;
        int b=2;


        // firstly try block will exceute normally if no exceptions means it will execute normally.
        //But if any exception occurs it will throw a error which should be handld by the catch block
        try{
            int c = a / b;
            System.out.println(c);
        }
        //If no exception means catch block never executes.
        catch(Exception e){
            System.out.println("Airthmetic Error");
        }


        System.out.println("Program Terminated");





    }
}
