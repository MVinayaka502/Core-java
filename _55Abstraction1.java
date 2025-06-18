//Abstract Introduction

abstract class car11{

    abstract public void drive();

    public void PlayMusic(){

        System.out.println("Playing Music");

    }

}

abstract class Lambo extends car11{

    public void drive(){

        System.out.println("Lambo is Driving");

    }
}

class ferrari extends Lambo{



}


public class _55Abstraction1 {
    public static void main(String[] args){


//        car11 c=new car11(); // Abstract class object cannot be created.
//        Lambo lb =new Lambo();

//        lb.drive();
//        lb.PlayMusic();

        ferrari fr=new ferrari();
        fr.drive();
        fr.PlayMusic();


    }
}
