package Package1;

public class TwoD_Transpose {
	public static void main(String[] args)
	{
		int[][] a = {{10,20,30},{40,50},{60}};
		for(int r=0; r<a.length; r++)
		{
			for(int c=0;c<a[r].length; c++ )
			{
				System.out.print(a[c][r]+ " ");
			}
			System.out.println();
		}
	}
}
