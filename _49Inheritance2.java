//Multi-Level Inheritance

// in java multiple and cyclic inheritance are not permitted.

class GeneralRobot{
    public void speaks(){
        System.out.println("Robot is Speaking");
    }
    public void listens(){
        System.out.println("Robot is Listening");
    }
    public void walks(){
        System.out.println("Robot is Walking");
    }
}

class TeacherRobot extends GeneralRobot{
    public void teaches(){
        System.out.println("Robot is Teaching");
    }
}

class FighterRobot extends TeacherRobot{
    public void fights(){
        System.out.println("Robot is fighting");
    }
}



public class _49Inheritance2 {

   public static void main(String[] args){
    FighterRobot fr=new FighterRobot();
    fr.speaks();
    fr.walks();
    fr.listens();
    fr.teaches();
    fr.fights();

   }
}


