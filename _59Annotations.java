//
//class Ab1{
//    public void show(){
//        System.out.println("In A Show");
//    }
//}
//
//
//class BA extends Ab1{
//
//
//    public void show() {
//        System.out.println("In B Show");
//    }
//
//
//}
//
//
//
//public class _59Annotations {
//    public static void main(String[] args){
//
//        BA aa=new BA();
//        aa.show();
//    }
//}


//Example 2


class Ab1{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A Show");
    }
}


class BA extends Ab1{

// here see the name of the method i intentionally gave wrong name see the spell in Belong which is Belongs
 //This are like logical errors not runtime or compile time error.
    //but here we have only two classes tocheck but in real life problems there are many classes we cant check all manually right
    //So we have to use annotations that if i made any mistakes u give me a warning

    @Override

//    public void showTheDataWhichBelongToThisClass() {
//        System.out.println("In B Show");
//    }
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In B Show");
    }


}



public class _59Annotations {
    public static void main(String[] args){

        BA aa=new BA();
        aa.showTheDataWhichBelongsToThisClass();
    }
}





















