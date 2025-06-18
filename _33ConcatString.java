// Trying different concat methods in java

public class _33ConcatString {
    public static void main(String[] args){
        System.out.println("Different concat methods in java : ");
        String s1="Java is superior to";
        String s2 = "python";

        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
        System.out.println();

        //Method 1: Using literals/String values
        String s4 = "java is superior to " + "python";
        System.out.println("Method 1: Using literals/String values : ");
        System.out.println("s1 and s2 : "+s4);
        System.out.println();
        // the output of s3 which stores in constant pool in spring pool


        //Method 2 : using String references values
        String s3=s1+" "+s2;
        System.out.println("Method 2 : using String references values : ");
        System.out.println("s1 and s2 : "+s3);
        System.out.println();
        // the output of s3 which stores in Non-constant pool in spring pool


        //Method 3; Using concat Method
        String s5=s1.concat(s2);
        System.out.println("Method 3; Using concat Method : ");
        System.out.println("s1 and s2 : "+s5);
        System.out.println();


    }
}
