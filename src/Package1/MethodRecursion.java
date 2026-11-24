package Package1;

public class MethodRecursion {
public static void demo(int a)
{
	//Base condition
	if(a>10)
	{
		return;
	}
	System.out.print(a+ " ");
	//Recursive call;
	demo(a+1);
}
public static void main(String[] args)
{
	int a=1;
	demo(a);
}
}
