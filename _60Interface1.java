//Using F@functionalInterface in interface
@FunctionalInterface
interface Aa{
    void show(); // Defaultly it is public and abstract
//    void run();// if we have FunctionalInterface then we can only keep or create one method inside thei interface
    //If we create more than one method in the interface we get error.
}


//class c implements Aa{
//    public void show(){
//        System.out.println("In show ");
//    }
//}

public class _60Interface1 {
    public static void main(String[] args){

        //Now trying to create object for interface
//        Aa aa=new Aa();//Ofcourse we get an error because we cant instances of interfaces and abstract class

        //to make object we need extend interface
//        c cc=new c();
//        cc.show();


        //As u see we are only using once we can also use anonymous inner class
    // here we are not makng the refernce of the interface .HERE we are creating instant of the anonymous innerclass and referncing to that object

        Aa aa=new Aa(){

            public void show(){
                System.out.println("In a Show");
            }


        };

        aa.show();

    }
}
