////Swiggy customer details update without using method overloading
//
//class customer{
//    char gender;
//    String city;
//    String userName;
//    long mobileNumber;
//
//    void setGender(){
//        gender='M';
//        System.out.println("M");
//    }
//    void setCity(){
//        city="Hyderbad";
//        System.out.println("Hyderbad");
//    }
//    void setUserName(){
//        userName="Customer_1";
//        System.out.println("Customer_1");
//    }
//    void setMobileNumber(){
//        mobileNumber=709037457;
//        System.out.println("709037457");
//    }
//
//}
//
//public class _22MethodOverloading1 {
//    public static void main(String[] args) {
//        customer c = new customer();
//        c.setGender();
//        c.setCity();
//        c.setUserName();
//        c.setMobileNumber();
//        // here we are calling multiple times but in real time applications there will be huge data if we want to change or update details
//        // it will be time consuming so we can use this using method overloading and we call same methods but passing different values gives us desire results.
//    }
//
//}

// Now We are using Method overloading

class customer{
    char gender;
    String city;

    long MobileNumber;

    void setDetails(char gender){
//        gender='F';
        System.out.println(gender);
    }
    void setDetails(String city){
//        city="Bangalore";
        System.out.println(city);
    }
    void setDetails(long mobileNumber){
//        mobileNumber=709037457;
        System.out.println(mobileNumber);
    }
}

public class _22MethodOverloading1 {
    public static void main(String[] args){
        customer c=new customer();

        c.setDetails(1234567890l);
        c.setDetails("hyderbaad");
        c.setDetails('M');
    }
}
