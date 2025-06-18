// constructor: The basic concept of constructor
//constructor is a speacilized method and it does return any value

class car1{
    // Declaring a instant variable.

    String name; // As instant variable the default value is null for String.
    int milage; // As instant variable the default value is Zero(0) for int.
    int cost; // As instant variable the default value is Zero(0) for int.

    car1(){

        name="bmw";
        milage=300; // 300 Horse power
        cost=200000;
        System.out.println("Car name is :"+name);
        System.out.println("Car name is :"+milage);
        System.out.println("Car name is :"+cost);
    }



}

public class _43Constructor0 {
    public static void main(String[] args){
        car1 c = new car1();

    }
}
