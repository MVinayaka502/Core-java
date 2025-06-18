// Ducking Exception Using throws Keyword

//class Ab11{
//    public void show(){
//        try{
//            Class.forName(className: "Calc");
//        }
//        catch(ClassNotFoundException e){
//            System.out.println("Class Not able to find");
//        }
//    }
//
//}
//
//public class _64Exception5 {
//    public static void main(String[] args){
//
//        Ab11 a=new Ab11();
//        a.show();
//
//
//}
//}


//Now show() tells i dont want to take control of exception

//
//class Ab11{
//    public void show() throws ClassNotFoundException{
//            Class.forName(className: "Calc");
//
//    }
//
//}
//
//public class _64Exception5 {
//    public static void main(String[] args){
//
//        Ab11 a=new Ab11();
//
//        try{
//
//            a.show();
//        }
//        catch(Exception e){
//
//            e.printStackTrace();
//        }
//
//
//
//    }
//}
