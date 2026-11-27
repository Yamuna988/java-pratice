package Number_problems;
import java.util.Scanner;
public class prime {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int n;
	        boolean isprime = true;
	        if(num <= 1)
	        {
	        	isprime = false;
	        }
	        else
	        {
	        	for(int i =2; i<=Math.sqrt(num); i++)
	        	{
	        		if(num%i == 0)
	        		{
	        			isprime = false;
	        			break;
	        		}
	        	}
	        }
	        if(isprime)
	        {
	        	System.out.println("Prime");
	        }
	        else
	        {
	        	System.out.println("Not prime");
	        }
}
}
