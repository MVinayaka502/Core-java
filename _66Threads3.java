// Using class extend we did in earlier is not a good wat of using threads
// We get one problem if we use like that

/**
 * Example: in the previous code we used class Demo001 extends Thread what if class also wants to inherit feartures from other class but in java multiple inheritance
 * is not allowed right check the code below
 */
//Supoose think we have a class Error and class demo003 wants to inherit class errors

// class Errors{
//     public void BascicError(){
//         System.out.println("Error occouried");
//     }
// }
//Here class Demo003 cant extend features and thread becuase multiple inheritance is not allowed in java and thread is also a class right
//So we need different approach of writing thread

//class Demo003 extends Errors,Thread {
//
//    public void run(){
//        //Actually they are running in parallel due to small output its not visible so change 5 to 100
//        for(int i=0;i<100;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(2); // After printing hi i will tell thread to wait for 10 milliseconds here hello will exceute and sleep same
//                //This inubild method throws checked exception so the developer need to handle the exception we can use throws or try catch
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Demo004 extends Thread{
//    public void run(){
//        //Actually they are running in parallel due to small output it's not visible so change 5 to 100
//        for(int i=0;i<100;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(2); // After printing hi i will tell thread to wait for 10 milliseconds here hello will execute and sleep same
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class _66Threads3 {
//    public static void main(String[] args){
//
//        Demo003 d1=new Demo003();
//        Demo004 d2=new Demo004();
//
//
//        d1.start();
//
//        d2.start();
//    }
//}

/**
 * Example: Thread  is the class which implements runnable in java
 * Runnable is a class which exceutes the run() method .In previous problem we were boring class run() from the runnable class
 * So instead of using extend thread can i use runnable
 * The start method wont work becuase it was here in class thread but now we r using class Runable
 * Runnable is a interface
 */

//class Demo003 implements Runnable {
//
//    public void run(){
//        //Actually they are running in parallel due to small output its not visible so change 5 to 100
//        for(int i=0;i<5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(2); // After printing hi i will tell thread to wait for 10 milliseconds here hello will exceute and sleep same
//                //This inubild method throws checked exception so the developer need to handle the exception we can use throws or try catch
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class Demo004 implements Runnable{
//    public void run(){
//        //Actually they are running in parallel due to small output it's not visible so change 5 to 100
//        for(int i=0;i<5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(2); // After printing hi i will tell thread to wait for 10 milliseconds here hello will execute and sleep same
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class _66Threads3 {
//    public static void main(String[] args){
//
//        Demo003 d1=new Demo003();// we can create a refernce of interface and object of a class
//        Demo004 d2=new Demo004();
//
//        Thread t1=new Thread(d1);//It can take object
//        Thread t2=new Thread(d2);
//
//
//
//        t1.start();// we get error because start was belongs to class Thread. So we created thread object and accessing the start
//        t2.start();
//    }
//}



//Example 3: Reduce the code Using lambda Expression and  Anonymous inner class
    //Lambda expression works only when we have @FunctionInterfaces
    //Runnable is  a @FunctionalInterface

public class _66Threads3 {
    public static void main(String[] args){

        Runnable d1=()->
        {
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                    try {Thread.sleep(2);} catch (InterruptedException e) {e.printStackTrace();}
                }
        };// we can create a reference of interface and object of a class

        Runnable d2=()->
        {
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try {Thread.sleep(2);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };
        Thread t1=new Thread(d1);//It can take object
        Thread t2=new Thread(d2);
        t1.start();// we get error because start was belongs to class Thread. So we created thread object and accessing the start
        t2.start();
    }
}
