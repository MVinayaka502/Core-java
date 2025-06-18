// operators in java

public class _4Operators1 {
    public static void main(String[] args){

//        // 1 Unary Operators (Increment or decrement)
//        int a=10;
//        int b=20;
//        a++; // increment
//        b--;// decrement
//        System.out.println("a= "+a);
//        System.out.println("b ="+b);


//        // Arithmetic Operators
//        int a=2;
//        int b=3;
//        System.out.println("Addition = "+(a+b));
//        System.out.println("Substration = "+(a-b));
//        System.out.println("Multiplication = "+(a*b));
//        System.out.println("Division = "+(a/b));
//        System.out.println("Modulo = "+(a%b));


        // Relation Operators

//        int a=10;
//        int b=20;
//        System.out.println("Greater than = "+(a>b));
//        System.out.println("Lesser than = "+(a<b));
//        System.out.println("Greater than and equals to = "+(a>=b));
//        System.out.println("Less than and equal to = "+(a<=b));
//        System.out.println("Equals to ="+(a==b));
//        System.out.println("Not equals to = "+(a!=b));


        // Boolean Operators
//
//        int a=10;
//        int b=20;
//        System.out.println("Boolean ="+(a>b));


        // Assignment Operators: is used to assign a value to any variable.It has right tot left associativity
        //I.e value given to tthe right-hand side of the operator is assigned to the variable on the left
        //example: a+=5
        // +=  Add and assign
        //_=  sub and assign

//        int a=10;
//        int b=20;
//        System.out.println("Orignal value of a="+a+" :updated ="+(a+=3));
//        System.out.println("Orignal value of b="+b+" :updated ="+(b+=3));


        //Logical Operators

//        boolean a=true;
//        boolean b=false;
//        System.out.println("Logical and ="+(a&&b)); //false
//        System.out.println("Logical OR ="+(a||b));//true
//        System.out.println("Logical Not ="+(!b)); // true


        //Ternary Operators: is a shorthand version of if else statement.It has three operands and hence its is called ternary operators
        // Syntax: Condition?if true:if false

//        int a=20, b=23;
//
//       boolean bb= (a>=b)?true:false;
//       System.out.println("Ternary ="+bb);



        //Bitwise Operator(used to perform the manipulation of indivual bits of a number
        // Bitwise and(&),Bitwise Or(|), Bitwise Xor(^), Bitwise Complement(~)

//        int a=0b1010; // 0b specifies that given inputs are in binary form
//        int b=0b1100;
//        System.out.println("Bitwise And ="+(a&b));
//        System.out.println("Bitwise OR ="+(a|b));
//        System.out.println("Bitwise Xor ="+(a^b));// either of the input should have 1 and if both inputs are 1 and 1 , 0 and 0 it will be treated as false(0)
//        System.out.println("Bitwise Complement ="+(~b));


        //Shift Operators(left shift(<<), Signed Right shift(>>), unsigned right shift(>>>)

        int a=10;
        System.out.println("Left shift = "+(a<<1)); // a=1100 and left shift by 1
        // 10100=20 // output a=20.
        System.out.println("Signed right shift ="+(a>>1)); // a=1100 and signed right shift by 1
        // 0101=5 // output=5.







    }


}
