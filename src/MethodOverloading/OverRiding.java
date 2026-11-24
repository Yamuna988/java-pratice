package MethodOverloading;

public class OverRiding {

    public void demo() {
        System.out.println("Parent demo method");
    }

    public void test() {
        System.out.println("Parent test method");
    }
}

class Child extends OverRiding {
    public void demo() {
        System.out.println("Method overriding");
        System.out.println("Thank you!!");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.demo();
        c.test();
    }
}