//Create a program that converts a temperature from Fahrenheit to Celsius and vice versa.

public class _5TemperatureConversion {
    public static void main(String[] args){

        int temp_fr=5000;
        int temp_cel=50;

        // logic to convert Fahrenhrit to celsius

//        Celsius = (Fahrenheit - 32) * 5/9
//        Fahrenheit = (Celsius * 9/5) + 32

        int celsius=(temp_fr-32)*5/9;
        System.out.println("Updated fr to celsius value is :"+ celsius);

        int fahrenheit=(temp_cel*9/5)+32;
        System.out.println("Updated celsius to fr value is :"+fahrenheit);



    }
}
