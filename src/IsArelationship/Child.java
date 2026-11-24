package IsArelationship;

public class Child extends Parent {
static {
	System.out.println("Child Intiliazer");
}
static int z;
public static void main(String[] args)
{
	System.out.println(x); //inherited static
	System.out.println(y);  //variables
	System.out.println(z);   //declared srtatic variables
}
}
