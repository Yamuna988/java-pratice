package Package1;
import java.util.*;
public class DynamicArray {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the array size: ");
	int n = s.nextInt();   
	int[] a = new int[n];
	System.out.println("Enter the values: ");
	//To store
		for(int i=0; i<a.length; i++)
		{
			a[i] = s.nextInt();
		}
	//To Access
	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
