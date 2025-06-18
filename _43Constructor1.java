//constructor:
// Making the variables as private/encapsulated .To access those details.
// we need to use setter and getter method to access the values.

class car{

    private String name; // instance variable(default values are assigned to the instant variable)
    private int milage; // instant variables
    private int cost; //instant variables

    // declaring a zero parameterized constructor(while creating an instance of the class car first it check the class
    // the stores the instant variables with default values and then it also checks the car()
    //method because its a zero parameterized constructor.it will read/access the car method
    // then the values are updated with given values.

    car(){
        name="BMW";
        milage=300; //300 Horse_power
       cost=1500000;
    }

    // setter method

    String getName(){
        return name;
    }
    int getMilage(){
        return milage;
    }
    int getCost(){
        return cost;
    }

}

public class _43Constructor1 {
    public static void main(String[] args){
        //creating instance of the class car

        car c=new car();
        System.out.println(c.getName());
        System.out.println(c.getMilage());
        System.out.println(c.getCost());


    }
}




