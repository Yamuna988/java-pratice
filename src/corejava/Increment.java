package corejava;

public class Increment {
public static void main(String[] args)
{
	int a = -3,b = 0, c = -6;
	a = a++ - (--b);
	b = ++c + (1 * ++b);
	c = a + b + (a++ *1);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
