//REVERSE OF PRIME NUMBER IS ALSO A PRIME NUMBER
//THE ORIGINAL NUMBER AND REVERSE NUMBER SHOULD NOT BE EQUAL

package Number_problems;

import java.util.Scanner;

public class twisted_prime {
	   public static boolean isPrime(int num) 
	   {
           if(num <= 1)
           {
        	   return false;
           }
           for(int i=2; i<=num/i; i++)
           {
        	   if(num%i == 0)
        	   {
        		   return false;
        	   }
           }
           return true;
	       
}
	   public static int reverse(int num)
	   {
		   int rev = 0;
		   while(num>0)
		   {
			   int r = num % 10;
			   rev = rev*10 + r;
			   num = num/10;
		   }
		   return rev;
	   }
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int rev = reverse(num);
	        if(isPrime(num) && isPrime(rev) && num!=rev)
	        {
	        	System.out.println("Twisted prime");
	        }
	        else
	        {
	        	System.out.println("Not Twisted prime");
	        }
}
}