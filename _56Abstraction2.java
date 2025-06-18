//example : Abstract

abstract class plane{

   abstract void takeOff();

    abstract void fly();

    abstract void land();


}

// CargoPlane

class cargoplane extends plane{

    void takeOff(){
        System.out.println("Cargoplane is taking off ");
    }
    void fly(){
        System.out.println("Cargoplane is flying ");

    }

    void land(){
        System.out.println("Cargoplane is landing");
    }

}

class passengerplane extends plane{

    void takeOff(){
        System.out.println("passengerplane is taking off ");
    }
    void fly(){
        System.out.println("passengerplane is flying ");

    }

    void land(){
        System.out.println("passengerplane is landing");
    }

}

class fighterrplane extends plane{

    void takeOff(){
        System.out.println("fighterrplane is taking off ");
    }
    void fly(){
        System.out.println("fighterrplane is flying ");

    }

    void land(){
        System.out.println("fighterrplane is landing");
    }

}



// create a class such that access other methods

class Airplane{

    void permit(plane ref){

        ref.takeOff();
        ref.fly();
        ref.land();

    }

}



public class _56Abstraction2 {
    public static void main(String[] args){

        cargoplane cp=new cargoplane();
        passengerplane pp=new passengerplane();
        fighterrplane fp=new fighterrplane();


        // code redudnacy
//
//        cp.takeOff();
//        cp.fly();
//        cp.land();
//
//        pp.takeOff();
//        pp.fly();
//        pp.land();
//
//
//        fp.takeOff();
//        fp.fly();
//        fp.land();

        Airplane ap=new Airplane();

        ap.permit(cp);
        ap.permit(pp);
        ap.permit(fp);



    }
}
