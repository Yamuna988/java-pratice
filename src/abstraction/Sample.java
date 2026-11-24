package abstraction;
//interface
public interface Sample {
	public static final int a=10;
	String s="Java";
	public static void demo() {
		System.err.println("demo static method");
	}
default void test() {
	System.out.println("test default non-static method");
}
void m1();
void m2();
int m3(int a, char b, String s);

public class SampleConcreteClass implements Sample {
	public void m1() {
		System.out.println("m1 method");
		System.out.println("this is child");
	}
	public void m2() {
		System.out.println("m2 method");
		System.out.println("this is child");
	}
	public int m3(int a,char b,String s) {
		return a+b;
	}
}
public static void main(String[] args)
{
	SampleConcreteClass s= new SampleConcreteClass();
	s.m1();
	s.m2();
	System.out.println(s.m3(10, 'a', "null"));
}
}
