// Encapsulation 2 : just make the class bank is private
//As we made it to private nodbosy can acees even the account holder

class bank1{
    private int amt=50000; // amt has private access in bank1
    int a; // instance variable:the default value is 0;
}

public class _39Encapsulation2 {
    // class/person Geninue
    public static void main(String[] args){
//        bank1 b=new bank1();
//        System.out.println("Amount = "+b.amt);
        System.out.println("Hello world");

    }
}


//public class _39Encapsulation2{
        //class/person Fraud
//    public static void main(String[] args){
//        bank1 b=new bank1();
//        System.out.println("Amount = "+b.amt);
//
//    }
//}


//while calling the amt variable with bank references(b.amt) we cannot acces it directly
//because amt has private access in bank1.