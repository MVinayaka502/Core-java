//Mutable strings can be build using String Buffer/String Builder
public class _35StringBuilder {
    public static void main(String[] args){
//        //String immutable example
//        String s1="Hello world";
//        System.out.println("S1 : "+s1);
//
//        String s=s1.concat(" i am from india");
//        System.out.println("S : "+s);



        // String mutable using String Builder

        System.out.println("Using String Builder : ");
        // creating string builder
        StringBuilder s=new StringBuilder();
        System.out.println("Memory Allocation of StringBuilder : "+s.capacity());// 16 bits


        s.append("java ");
//        System.out.print(s);

        s.append("Javascript ");
        System.out.print(" "+s);


        System.out.println();

//        System.out.println("How much memory is used : "+s.length());
//        s.trimToSize();
//        System.out.println("Trim : "+s.length());

    }
}
