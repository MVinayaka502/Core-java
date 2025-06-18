//Encapsulation: Basics:Here both can access the amount which is not secure .only the authorized person should access.

 class bank{
    int amt=50000;
}

// public class _38Encapsulation1 {
//    // class Geninue
//    public static void main(String[] args){
//        bank b=new bank();
//        System.out.println("Amount = "+b.amt);
//    }
//}

public class _38Encapsulation1{
    //Class Fraud
    public static void main(String[] args) {
        bank b = new bank();
        System.out.println("Amount = " + b.amt);//int amt is instant variable which stores in heap so while calling b.amt we can access the stored value in amt
    }

    }
