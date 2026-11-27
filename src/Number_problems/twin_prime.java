//DIFFERENCE BETWEEN 2 PRIME NUMBERS IS 2

package Number_problems;

import java.util.Scanner;

public class twin_prime {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter a number: ");
	        int num2 = sc.nextInt();
	        int count1=0;
	        int count2=0;
	        for(int i=1;i<=num1;i++)
	        {
	        	if(num1 % i== 0)
	        	{
	        		count1++;
	        	}
	        }
	        for(int i=1;i<=num2;i++)
	        {
	        	if(num2 % i== 0)
	        	{
	        		count2++;
	        	}
	        }
	        if(count1 == 2 && count2 == 2 && (num1-num2==2 ||  num2-num1==2))
	        {
	        	System.out.println("Twin prime Number");
	        }
	        else
	        {
	        	System.out.println("Not twin prime number");
	        }

	        
}
}
