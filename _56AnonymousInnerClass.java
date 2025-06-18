//_56AnonymousInnerClass: means a class which dont have a name
//Anonymous classes basically written after object creation and before indentation as show in the below

class A111{
    public void show(){
        System.out.println("A111 in show");
    }

}
// Now i want to change the behaviour of the method show so i can do method overriding
//class B111 extends A111{
//    public void show(){
//        System.out.println("B111 in show");
//    }
//}

public class _56AnonymousInnerClass {
    public static void main(String[] args){

    //Create object
//    A111 aa=new A111();
//    aa.show(); // This will only acces the class A111 not B111

//        // To access to the class B111 create instance of the object of class B111
//        B111 bb=new B111();
//        bb.show();

        //But there are some siutiation where we use class only once .In such cases why we need to write the class instead we can use Anonymous inner class
        //Comment the class A111 and B111 first. we need only class A111. i am creating object of A111 again

        A111 aa=new A111()
            //Anonymous inner class: As U observed it does'nt have a class name and it is derivies inside main class so it is called Anonymous Inner class.
        {
            //Now override the method show();
            public void show(){
                System.out.println("In b111 show");
            }
        };

        aa.show(); // calling show method // output is In B111 show

        //Did you observe that even with refernce of class A111 we accesed the show method it exeuted the class A111 method
        //Instead it exceuted the Anonymous Inner class this is why we used this method to exceute only once





    }
}
