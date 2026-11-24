package Package1;

public class ArrayLength {
public static void main(String[] args)
{
	String[] s = new String[3];
	System.out.println("Length of string: "+s.length);
	//To store
	for(int i = 0; i<s.length; i++)
	{
		System.out.print(s[i]+" ");
	}
	//To print
	s[0] = "Hello";
	s[1] = "Hi";
	s[2] = "Aditya";
	System.out.println();
	for(int i = 0; i<s.length; i++)
	{
		System.out.print(s[i]+" ");
	}
}
}
