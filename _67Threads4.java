//Race Condition: let we have two threads T1 and t2 And we are calling the same method supoose we gave 1000 iterations in each thread then total there should be 2000 threads(count value) right
//But we don't  get 2K we get random values because threads are working in parallel but main don't have any work so main will calculate the count in between the thread
//To tell to both threads to count values only when the thread operations are compeltely
//To tell the treads we are using the in build methods which is synchronized as shown in the below.


/**
 * Explination: The below code have counter class where count is declared which is instance variable and default value is zero
 * And we have method called increment() inside we are incrementing count by 1
 * We have a main class _67Threads4 there firstly we created the instant of the class counter
 * Then we have two Anonymous innerclass d1 and d2
 * We declared threads in the line 41 and 42
 * then we are calling the method by saying t1.start() and t2.start()
 */

// class Counter{
//    int count;
//    public  void increment(){
//        count ++;
//    }
//}
//
//public class _67Threads4 {
//    public static void main(String[] args) throws InterruptedException {
//        Counter cc=new Counter(); //Creating instantance of the class Counter
//
//        Runnable d1=()->
//        {
//            for(int i=1;i<=1000;i++){
//               cc.increment();
//            }
//        };
//
//        Runnable d2=()->
//        {
//            for(int i=1;i<=1000;i++){
//                cc.increment();
//                            }
//        };
//
//
//        Thread t1=new Thread(d1);//It can take object
//        Thread t2=new Thread(d2);
//
//        t1.start();// if we use the method name directly here we get error because start was belongs to class Thread.
//        // So we created thread object (t1 and t2) and accessing the start.t1 is referred to the class d1 as the paramter
//        t2.start();
//
//
//        t1.join(); // Join is the method that tells two threads to wait after completing you can add count
//        t2.join();
//
//        System.out.println(cc.count);
//
//    }
//}



//Example :2 Everything is good in the above code but the output keeps changing everythime when we run
    //Why is that means because where t1 and t2 both are executing the same method i mean
    //Think at one moment while iterating both threads comes to count at same time and gave the count value as 4
    // t1=count++ it should be 5, but in t2=count++ i should be 5.it means we called increment two times and incremented happernd only one time

    //This is wrong right both should not interfere while executing
    //So we are using the synchronized /Using this we can tell t1 while implemting count t2 should  not work with the count.only one thread should work at a time



class Counter{
    int count;
    public synchronized void increment(){
        count ++;
    }
}

public class _67Threads4 {
    public static void main(String[] args) throws InterruptedException {
        Counter cc=new Counter(); //Creating instantance of the class Counter

        Runnable d1=()->
        {
            for(int i=1;i<=1000;i++){
                cc.increment();
            }
        };

        Runnable d2=()->
        {
            for(int i=1;i<=1000;i++){
                cc.increment();
            }
        };


        Thread t1=new Thread(d1);//It can take object
        Thread t2=new Thread(d2);

        t1.start();// if we use the method name directly here we get error because start was belongs to class Thread.
        // So we created thread object (t1 and t2) and accessing the start.t1 is referred to the class d1 as the paramter
        t2.start();


        t1.join(); // Join is the method that tells two threads after two wait after completing you can add count
        t2.join();

        System.out.println(cc.count);

    }
}

//Thus we avoided t1 and t2 to run the threads parallely this is how we avoided Race Conditions