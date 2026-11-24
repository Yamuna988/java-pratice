package OOPS;

public class NonStatic {
	static String collegename;
//non-static variable
	int id;
	String name;
	//non-static method
	public void details()
	{
		System.out.println(id+name);
	}
	//constructor
	public NonStatic()
	{
	System.out.println("Construcot intializer");
	{
		System.out.println("NSIB-1");
	}
	{
		System.out.println("NSIB-2");
	}
	{
		System.out.println("NSIB-3");
	}
	}
	public static void main(String[] args)
	{
		NonStatic n = new NonStatic();
		n.details();
		System.out.println(n.collegename);
	}
}
