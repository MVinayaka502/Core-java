// Throw: Throw is used to  throw the exception and call the catch block even when the exception doest occur

// Think if did j=18/0 which causes exception and calls the catch block and prints the statement like something went wrong like that
//if j=18/20 answer is 0 .But i dont want to display that i dont want to display the output zerp rather than that i should display default values like that
//But the think is Catch block is only called when the exception occurs. So Now what to do to call Catch block

// So Use throw keyword it wil call the constructor and also even call the customerized catch block like arithmetic exception cath block or Array out of bounds one



public class _63Exception3 {
    public static void main(String[]args){
        int i=18;
        int j=0;

        try{

//            j=i/j; // this gives you Airthmetic Exception

            j=j*i; // this will gives output zero
            //This line gives output zero no exception occurs and prints zero
            //But i don't want this answer i want default output which is in catch block how can i access that when no exception occurs
            //Using throw keyword

            if(j==0) {
                throw new ArithmeticException("I don't want to print Zero okay");  // Even this is object right we can even pass values.
            }

        }
        catch(ArithmeticException e){
            j=18;//Assigning Default value
//            System.out.println("This is the default value.....  "+e);
            System.out.println("Arithmetic Exception is handled ");
            System.out.println(e);

        }
        catch (Exception e) {
            System.out.println("Default catch block");
            System.out.println("Exception is handled");
        }


        System.out.println(j);



    }
}
