package Number_problems;

import java.util.Scanner;

public class perfect_number {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        for(int i=1;i<=num/2;i++)
	        {
	        	if(num%i == 0)
	        		sum=sum+i;
	        }
	        if(num == sum)
	        {
	        	System.out.println("Perfect Number");
	        }
	        else
	        {
	        	System.out.println("Not perfect number");
	        }
}
}

//SUM OF FACTORS OF THE NUMBER EXCLUDING NUMBER ITSELF
//IF SUM == NUMBER THEN ITS A PERFECT NUMBER
//TIME COMPLEXITY = O(N)