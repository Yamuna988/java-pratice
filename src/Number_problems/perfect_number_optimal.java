package Number_problems;

import java.util.Scanner;

public class perfect_number_optimal {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        for(int i=1; i<=num/i;i++)
	        {
	        	if(num%i ==0)
	        	{
	        	sum = sum+i;
	        	int otherfactor = num/i;
	        	if(otherfactor != num && otherfactor != i)
	        	{
	        		sum = sum+otherfactor;
	        		
	        	}
	        }
	        }
	        if(sum== num)
	        {
	        	System.out.println("perfect number");
	        }
	        else
	        {
	        	System.out.println("not perfect number");
	        }
}
}

//TIME COMPLEXITY = O(SQUARE ROOT OF N)