//Enum:Introduction

enum status{
    Running, Pending ,failed, success;
}


public class _58Enum1 {
    static public void main (String...args){

       // is same as below int i=5;

//       status s=status.success;
//       System.out.println(s);

//        status s=status.success;
//        System.out.println(s +" :"+s.ordinal());

        //To print all
        status[] ss=status.values();
        for(status s:ss){
            System.out.println(s +" :"+ s.ordinal());
        }

    }

}
