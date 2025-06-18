//Enum with if else and switch


//Enums are like class
enum status1{
    Running, Pending,Failed, Success;
}




public class _58Enum2 {
    public static void main(String[] args){

        status1 s=status1.Pending;
        // using if else to explain

//        if(s==status1.Running) {
//            System.out.println("Your application is Running");
//        }
//            else if (s==status1.Pending){
//
//                System.out.println("Please wait !");
//            }
//            else if (s==status1.Failed) {
//                System.out.println("Your application is Failed / Tty again");
//
//            }
//
//            else{
//                System.out.println("Done ");
//            }
//




            // Using switch

        switch(s){
            case Running:
                System.out.println("Your application is Running");
                break;

            case Pending:
                System.out.println("Please Wait!!");
                break;

            case Failed:
                System.out.println("Your application is Failed");
                break;

            case Success:
                System.out.println("Done");
                break;
        }



        }

    }


