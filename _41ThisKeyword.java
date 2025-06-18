// This keyword: us used to differniate the local variables and instant variables.
//This is the keyword which references current object (means from where this set methoad called the object )

class Human{
    private int age;
    private String name;

    public void setAge(int age){
        this.age =age;
        // here we need to assign the local variable age value to instant variable age
//in simple words by using defined object (obj) or default object (this) is used to assign the local value variable to instant variable

    }

    public int getAge(){

        return age; // returns the age 23 to the print statement.

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}

public class _41ThisKeyword {
    public static void main(String[] args){

        Human obj=new Human();
        obj.setAge(23);
        obj.setName("Vinay");

        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
