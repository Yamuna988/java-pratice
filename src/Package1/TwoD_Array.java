package Package1;

public class TwoD_Array {
public static void main(String[] args)
{
	int [][] a= new int[3][3];
	System.out.println(a);
	System.out.println("Row Size: "+a.length);
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println("Column size of Row 0:"+a[0].length);
	System.out.println("Column size of Row 1:"+a[1].length);
	System.out.println("Column size of Row 2:"+a[2].length);
	for(int row=0; row<a.length; row++)
	{
		for(int column=0; column<a[row].length; column++)
		{
			System.out.print(a[row][column]+" ");			
		}
		System.out.println();
	}
}
}
