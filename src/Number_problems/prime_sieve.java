//PRINT ALL PRIME NUMBERS UPTO GIVEN NUMBER

//INTIALLY ALL ARE CONSIDERED AS PRIME WE NEDD TO CHECK UPTO SQUARE ROOT OF THE NUMBER 
//FIRST TAKE PRIME NUMBER AND ALL THE MULTIPLES OF THAT ARE CONSIDERED AS NOT PRIME LIKE THAT CONTINUE WITH NEXT PRIME NUMBER
//DO UPTO THE SQUARE ROOT NUMBER AND PRINT THE PRIME NUMBERSS
package Number_problems;
import java.util.Scanner;
public class prime_sieve {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        boolean [] isPrime = new boolean[ num + 1];
	        for(int i = 2;i<=num; i++)
	        {
	        	isPrime[i] = true;
	        }
	        for(int i =2; i<=num/i; i++)
	        {
	        	if(isPrime[i])
	        	{
	        		for(int j=i*i; j<=num; j=j+i)
	        		{
	        			isPrime[j] = false;
	        		}
	        	}
	        }
	        for(int i = 2; i<=num ; i++)
	        {
	        	if(isPrime[i]) 
	        	{
	        		System.out.println(i + " ");
	        	}
	        }
	        
}
}



