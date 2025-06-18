// Now we got output in previous code but i want to print hi and bye simultaneously or on after other





/* Tread priority  gives u a priority from 1-10. 1 means least priority and 10 means max priority or you can use inbuild constant methods like maxPriority and MinPriority.
Example 2: Simulatoneusly output like hi, hello, hi, hello. like that using Thread priority and sleep
 */
//Using priority to check the priority of the thread
//We can only suggest priority to scheduler in OS we cant order it completely depended on the scheudler


//class Demo001 extends Thread {
//
//    public void run(){
//        //Actually they are running in parallel due to small output its not visible so change 5 to 100
//        for(int i=0;i<100;i++){
//            System.out.println("Hi");
//        }
//    }
//}
//class Demo002 extends Thread{
//    public void run(){
//        for(int i=0;i<100;i++){
//            System.out.println("Hello");
//        }
//    }
//}
//public class _65Threads2 {
//    public static void main(String[] args){
//
//
//
//
//        Demo01 d1=new Demo01();
//        Demo02 d2=new Demo02();
////        System.out.println(d1.getPriority());// It gives you the priority of the thread od object d1
//        //Or we set priority value
//        d1.setPriority(10);// We are setting priority.we requesting scheduler .its depends on him he will accept it or not
//
//        //Or you can use in build constant
//
//        System.out.println(Thread.MAX_PRIORITY);// Max=10, min=1
//
//
//        d1.start();
//        d2.start();
//    }
//}




//To print one below one use sleep


class Demo001 extends Thread {

    public void run(){
        //Actually they are running in parallel due to small output its not visible so change 5 to 100
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(2); // After printing hi i will tell thread to wait for 10 milliseconds here hello will exceute and sleep same
                //This inubild method throws checked exception so the developer need to handle the exception we can use throws or try catch
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}
class Demo002 extends Thread{
    public void run(){
        //Actually they are running in parallel due to small output it's not visible so change 5 to 100
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(2); // After printing hi i will tell thread to wait for 10 milliseconds here hello will execute and sleep same
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class _65Threads2 {
    public static void main(String[] args){

        Demo01 d1=new Demo01();
        Demo02 d2=new Demo02();


        d1.start();

        d2.start();
    }
}

//THe desired output i am not getting the code is correct but as the developer we can give request to scheduler
//Its depends on the scheduler
























