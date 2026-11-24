package abstraction;

// abstract class
public abstract class Test {
   public void m1() {
        System.out.println("m1 method");
    }

    public static void m2() {
        System.out.println("m2 static");
    }

    abstract void t1();

    abstract int t2(int a, int b);
}

// concrete class
class Demo extends Test {

    public void t1() {
        System.out.println("body provided");
        System.out.println("this is t1 method");
    }
    public int t2(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.t1();
        int result = d.t2(10, 20);
        System.out.println(result);
    }
}