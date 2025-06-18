//Wrapper classes

public class _54WrapperClasses {

    public static void main(String[] args){

        int num=4;// primitive data type
//        Integer num1=new Integer(6); // deprecated means java developers removed this syntax in the future
//        Integer num1=new Integer(num);// Boxing
// we are taking primitve value and placing in a object this concept is called boxing




        Integer num1=num; // num is primitive type and converted to object automatically so it is Auto-Boxing
        //Auto Boxing
        System.out.println(num1);



//  Integer num2=num1.intValue();// un-boxing: its done manually


             int num2=num1; // Auto-unboxing: it done automatically


//         System.out.println(num2);


        // Wrapper classes also give u feature .lets assume we have string str and the value is number inside the string format and while printing str no issues.But when we apply any operation to it wont work because as 12 is a string
        // we get error on line 34

//        String str="12";
//        System.out.println(str*2);

        // So to overcome this issue we should convert to int .then  we can use inbuilt function

        String str="12";
        int num3= Integer.parseInt(str);// this will convert now 12 as string to int now we can apply operation

        System.out.println(num3 );
        System.out.println(num3*2);


    }
}
