// using method overRiding in java
//Overriding in Java occurs when a subclass (child class) implements a method that is already
// defined in the superclass or Base Class.The overriding method must have the same name,
// parameters, and return type as the method in the parent class.
// This allows subclasses to modify inherited behavior while maintaining a consistent interface.
//The method in the subclass must have the same name, return type,
// and parameters as the method in the superclass.The method called is determined at runtime,
// allowing dynamic behavior based on the object’s type.Only non-static methods can be overridden.
//The@Override annotation ensures the method is correctly overridden and helps avoid errors.



class Animal{
    void move() {
        System.out.println("Animal is Moving");
    }
    void eat(){
    System.out.println("Animal is eating");
    }

}


class Dog extends Animal{
   void move(){
        System.out.println("Dog is Moving");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}



public class _23MethodOverriding {
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
        d.move();

    }
}
