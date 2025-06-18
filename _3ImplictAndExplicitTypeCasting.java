public class _3ImplictAndExplicitTypeCasting {

    public static void main(String[] args){

        //Implicit(Smaller datatype is stored in higher data type)
        //and this process should be done automatically by jvm
        System.out.println("Implict Conversion: ");
        int salary=80000; // salary is of type int

        System.out.println("Salary ="+salary);

        double dupSalary=salary;
        System.out.println("Dobule ="+dupSalary);


        // Explicity Higher data type is stored in smaller data type and this process
        // should be done manually the jvm wil not convert automatically

        System.out.println();
        System.out.println("Explict Conversion: ");

        double sal=899.999905; // per day salary
        System.out.println("Salary = "+sal);
        int dupsal=(int) sal;
        System.out.println("DupSalary = "+dupsal);

    }
}
