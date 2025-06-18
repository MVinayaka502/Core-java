//Type promotion in java

 class Rectangle{

    float area(float a, int b){    
        // but the parameters accepting are int and float
        // now it will check minimum one match if it found its okay otherwise
        // Take example: if we pass integer value then it will look for next bigger data type in the order long, float, double
        float areaOfRec=a*b;
        System.out.println("Executed the float area method");
        return areaOfRec;
    }

    double area (double a, double b){
        double areaOf=a*b;
        System.out.println("Executed the double area method");
        return areaOf;

    }

//    long area(long a,float b){
//        float areaOf1=(a*b);
//        System.out.println("Executed long method : ");
//        return (long) areaOf1;
//
//
//    }

}

public class _36TypePromotion {

    public static void main(String[] args){
        int a=10,b=20;
       Rectangle ref=new Rectangle();
       System.out.println(ref.area(a,b));// the value of a & b is of type int

    }
}



