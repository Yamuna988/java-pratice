package MethodOverloading;
// Run time binding
public class Fruit {
   public void demo() {
        System.out.println("Fruit demo method");
        System.out.println("This is parent method");
    } 
}
class Apple extends Fruit {
    public void demo() {
        System.out.println("Apple demo method");
        System.out.println("This is child");
    }
   // Declared method
    public void test() {
        System.out.println("Apple test method");
    }
    public static void main(String[] args) {
        // Upcasting
        Fruit f = new Apple();
        f.demo();
        // f.test();   // Error
        //downcasting 
        Apple a = (Apple)f;
        a.test();
    }
}