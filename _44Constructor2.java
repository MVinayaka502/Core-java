//Zero parameterized constructor and parameterized constructor
class car3{

    private String name;
    private int milage;
    private int cost;

    //zero parameterized constructor
    car3(){
        name="BMW";
        milage=300; //Horse Power
        cost=500000;
    }
    //3 parameterized constructor

    car3(String name,int milage,int cost){
//
//        this();
       this.name=name;
        this.milage=milage;
      this.cost=cost;


}
    // Creating setter and getter method

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

public class _44Constructor2 {
    public static void main(String[] args){

        car3 c=new car3();
        System.out.println("Car name : "+c.getName());
        System.out.println("Car name : "+c.getMilage());
        System.out.println("Car name : "+c.getCost());

        System.out.println();


        car3 cc=new car3("ferrari",400,700000);
        System.out.println("Car name : "+cc.getName());
        System.out.println("Car name : "+cc.getMilage());
        System.out.println("Car name : "+cc.getCost());




    }
}
