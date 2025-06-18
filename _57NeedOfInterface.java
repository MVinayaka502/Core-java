//What is the need of the interface
// Example : 1

//class laptop{
//
//    void code(){
//        System.out.println("code, compile, run");
//    }
//
//}
//class Developer{
//
//    void code(laptop lap){
//
//        lap.code();
//    }
//}
//
//public class _57NeedOfInterface {
//    public static void main(String[] args){

//        Developer dp=new Developer();
////        dp.code();// created the instance of the class Developer
//        // example : Assume ur joined as developer in   a company and they told you to code .and you requested them to provide the laptop
//
////Now i have created a class laptop and creating the instance of it
//
//        laptop lap=new laptop();
//        dp.code(lap);
//
//    }
//}





////Example -2 : In the example one the developer is fixed to the laptop but in real life some company's also provide desktops right
//
//    class desktop {
//        void code(){
//            System.out.println("code , compile, run and faster");
//        }
//}
//
//class laptop{
//    void code(){
//        System.out.println("code , compile, run");
//    }
//}
//
//class developer{
//
//        void code(desktop desk){
//            desk.code();
//
//        }
//}
//
//class _57NeedOfInterface{
//    public static void main(String[] args){
//        developer dev=new developer();
//        laptop lap=new laptop();
//        desktop desk=new desktop();
////        dev.code(lap);
//        dev.code(desk);
//    }
//
//}


//
//
////Example -3 : Now assume the application that developer built only works on the laptop buut the is gave desktop, your saying devloper is depending on the desktop or laptop
//class desktop {
//    void code(desktop desk){
//        System.out.println("code , compile, run and faster");
//    }
//}
//
//class laptop{
//    void code(){
//        System.out.println("code , compile, run");
//    }
//}
//
//class developer{
//
//    void code(desktop desk){
//        desk.code();
//
//    }
//}
//
//class _57NeedOfInterface{
//    public static void main(String[] args){
//        developer dev=new developer();
//        laptop lap=new laptop();
//        desktop desk=new desktop();
////        dev.code(lap);
//        dev.code(lap);// but developer told his application will not work on desktops
//    }
//
//}







//
////Example -4 : Developer is not depended on laptop or desktop he is depended on the computer or a system were he can work
//
//     class computer{
//
//         public void code()
//    {
//
//    }
//
//
//}
//
//
//class desktop extends computer {
//    public void code(){
//        System.out.println("code , compile, run and faster");
//    }
//}
//
//class laptop extends computer{
//    public void code(){
//        System.out.println("code , compile, run");
//    }
//}
//
//class developer{
//
//
//        // computer is references but we passed desk and its object is pointing to desktop as u see in line 152
//    public void code(computer lap){
//        lap.code();
//
//    }
//}
//
//class _57NeedOfInterface{
//    public static void main(String[] args){
//        developer dev=new developer();
//        computer lap=new laptop();
//        computer desk=new desktop();
////        dev.code(lap);
//        dev.code(desk);
//        //or
////        dev.code(lap);
//        // here we are calling desktop object with reference computer
//        // here developer methode code is accepting the parameter as computer which is the refernces for both the class desktop and laptop only change is its pointing to corresponding objects
//
//    }
//
//}







////Example -5 :  but did u observed in computer we are only declare method but not using so can we do abstract
//
//
// abstract class computer{
//
//     abstract public void code();
//
//}
//
//class desktop extends computer {
//    public void code(){
//        System.out.println("code , compile, run and faster");
//    }
//}
//
//class laptop extends computer{
//    public void code(){
//        System.out.println("code , compile, run");
//    }
//}
//
//class developer{
//
//
//    // computer is references but we passed desk and its object is pointing to desktop as u see in line 152
//    public void code(computer lap){
//        lap.code();
//
//    }
//}
//
//class _57NeedOfInterface{
//    public static void main(String[] args){
//        developer dev=new developer();
//        computer lap=new laptop();
//        computer desk=new desktop();
////        dev.code(lap);
//        dev.code(desk);
//        //or
////        dev.code(lap);
//        // here we are calling desktop object with reference computer
//        // here developer methode code is accepting the parameter as computer which is the refernces for both the class desktop and laptop only change is its pointing to corresponding objects
//
//    }
//
//}





//Example -6 :  we can also make it as interface

// interface computer{
//
//     public void code();
//
//}
//
//class desktop implements computer {
//    public void code(){
//        System.out.println("code , compile, run and faster");
//    }
//}
//
//class laptop implements computer{
//    public void code(){
//        System.out.println("code , compile, run");
//    }
//}
//
//class developer{
//
//
//    // computer is references but we passed desk and its object is pointing to desktop as u see in line 152
//    public void code(computer lap){
//        lap.code();
//
//    }
//}
//
//class _57NeedOfInterface{
//    public static void main(String[] args){
//        developer dev=new developer();
//        computer lap=new laptop();
//        computer desk=new desktop();
////        dev.code(lap);
////        dev.code(desk);
//        //or
//        dev.code(lap);
//        // here we are calling desktop object with reference computer
//        // here developer methode code is accepting the parameter as computer which is the refernces for both the class desktop and laptop only change is its pointing to corresponding objects
//
//    }
//
//}







// Example 7: multiple interface


//interface computer{
//
//    public void code();
//
//}
//
//
//interface x{
//
//}
//// Multiple intefaces
//
//class bb1 implements x,computer{
//
//    public void code(){
//
//    }
//}
//
//
//
//
//class desktop implements computer {
//    public void code(){
//        System.out.println("code , compile, run and faster");
//    }
//}
//
//class laptop implements computer{
//    public void code(){
//        System.out.println("code , compile, run");
//    }
//}
//
//class developer{
//
//
//    // computer is references but we passed desk and its object is pointing to desktop as u see in line 152
//    public void code(computer lap){
//        lap.code();
//
//    }
//}
//
//class _57NeedOfInterface{
//    public static void main(String[] args){
//        developer dev=new developer();
//        computer lap=new laptop();
//        computer desk=new desktop();
////        dev.code(lap);
////        dev.code(desk);
//        //or
//        dev.code(lap);
//        // here we are calling desktop object with reference computer
//        // here developer methode code is accepting the parameter as computer which is the refernces for both the class desktop and laptop only change is its pointing to corresponding objects
//
//    }
//
//}


// Example :8 in java one class can extend another class but can we extend one interface to another

   //class-class =extends
   //class -interface=implements
   //interface =interface =extends



interface computer{

    public void code();

}
// Multiple interfaces

interface x{

public void run();

}
interface y extends x{


}


class bb1 implements y,computer{

    public void code(){

    }

    public void run(){

    }
}


class desktop implements computer {
    public void code(){
        System.out.println("code , compile, run and faster");
    }
}

class laptop implements computer{
    public void code(){
        System.out.println("code , compile, run");
    }
}

class developer{


    // computer is references but we passed desk and its object is pointing to desktop as u see in line 152
    public void code(computer lap){
        lap.code();

    }
}

class _57NeedOfInterface{
    public static void main(String[] args){
        developer dev=new developer();
        computer lap=new laptop();
        computer desk=new desktop();
//        dev.code(lap);
//        dev.code(desk);
        //or
        dev.code(lap);
        // here we are calling desktop object with reference computer
        // here developer methode code is accepting the parameter as computer which is the refernces for both the class desktop and laptop only change is its pointing to corresponding objects

    }

}












