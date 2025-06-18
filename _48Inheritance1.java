// Rule 1; Private members cannot takes part in inheritance

//Single Level Inheritance.


class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

}

//Inheritance

class AdvCalculator extends Calculator{

    public int div(int a,int b){
        return a/b;
    }

}

class _48Inheritance1{
    public static void main (String[] args){
        AdvCalculator advcal=new AdvCalculator();
//        cal.add(10,20);
        System.out.println(advcal.add(10,20));
        System.out.println(advcal.div(10,2));


    }
}