// Compairing Arrays using inbuilt methods

import java.util.Arrays;

public class _25ComparingArrays {
    public static void main(String[] args){
        //Declaring arrays
        int[] a={10,20,40,80};
        int[] b={90,40,30,20,40};
        int[] c={90,40,30,20,40};

        // with using Inbuilt methods in java

        boolean compare1= Arrays.equals(a,b);
        System.out.println(compare1);

        boolean compare2=Arrays.equals(a,c);
        System.out.println(compare2);


        boolean compare3=Arrays.equals(b,c);
        System.out.println(compare3);







    }
}
