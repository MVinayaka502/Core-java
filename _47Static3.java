//class Test1{
//
//
//    //declaring static method
//
//
//
//}





public class _47Static3 {

    static{
        System.out.println("This is the 1st static block");
    }
    static{
        System.out.println("This is the 2nd static block");
    }


    static void func01(){
        System.out.println("Inside static method");
    }

    static {
        System.out.println("This is the 3rd static block");
    }
    static{
        System.out.println("This is the 4th static block");
    }



    public static void main(String[] args){

        _47Static3.func01();//as we know the jvm first checks static values then instant then it will looks for main method

    }
}
