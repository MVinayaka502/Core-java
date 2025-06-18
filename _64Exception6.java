
//try with finally keyword
//Also called try with resources

//Final keyword is used to end the connection or link or close the software etc

//Finally block will get exceuted even exception didnt occurs . its like it will exceute whatever it happend.

public class _64Exception6 {
    public static void main(String[] args){

        int i=0;
        int j=0;
        try{
            j=18/0;
//            System.out.println("Connection is terminated");//This line neve get exceuted because exception occurs at line 15 and it will come out from try block

           }// Try block can be written without exception
        // why it is written means when u dont want to handle exception which is not a good think but we can write try and finally

        catch(Exception e){

            System.out.println("Something went wrong :"+e);

        }

        finally{
            System.out.println("Connection is terminated 2");
        }




    }
}
