package Package1;

public class ArrayDirectValues {
public static void main(String[] args)
{
	int[] a = {10,20,30,40,50};
	System.out.println(a);
	System.out.println(a.length);
	for(int i = 0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
	a[0]=1;
	a[1]=2;
	System.out.println();
	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
