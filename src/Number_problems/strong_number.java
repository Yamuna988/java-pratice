package Number_problems;

import java.util.Scanner;

public class strong_number {
	public static int  factorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int temp =num;
	        int sum =0;
	        while(temp>0)
	        {
	        	int r=temp%10;
	        	sum =sum+factorial(r);
	        	temp = temp/10;
	        }
	        if(sum==num)
	        {
	        	System.out.println("strong number");
	        }
	        else
	        {
	        	System.out.println("not strong number");
	        }
}
	   }


//THE SUM OF FACTORIAL OF EACH DIGIT = NUMBER