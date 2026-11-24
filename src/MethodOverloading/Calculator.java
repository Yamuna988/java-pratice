package MethodOverloading;

public class Calculator {

    public static void add() {
        System.out.println(10 + 20 + 30);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static int add(int a, char b) {
        return a + b;
    }

    public int add(int a, int b, char c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // Static method - call directly
        add();

        // Create object for non-static methods
        Calculator c = new Calculator();

        // Non-static method
        c.add(10, 20);

        // Static method - can be called using class name
        System.out.println(Calculator.add(10, 'a'));

        // Non-static method
        System.out.println(c.add(10, 20, 'a'));
    }
}

