// Threads Introduction : smallest units working on the same time


/**
 * To achive threads which is to work any thing in parallel we need a speacilized class not ordinary class
 So we Are extending class to treads class
 */

class Demo01 extends Thread {

    public void run(){
        //Actually they are running in parallen due to small output its not visible so chamge 5 to 100
        for(int i=0;i<100;i++){
            System.out.println("Hi");
    }
    }
}
class Demo02 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
public class _65Threads1 {
    public static void main(String[] args){

            Demo01 d1=new Demo01();
            Demo02 d2=new Demo02();
            d1.start(); // if we want to achieve threads we need to use start instead of show() but this will not work because wheneverwe use start() we need to use run() complusorly
        //change show method to run().
            d2.start();
    }
}
