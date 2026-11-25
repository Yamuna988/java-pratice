package Number_problems;

import java.util.Scanner;

public class armstrong_number {
	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int temp = num;
	        int count = 0;
	         int sum = 0;
	         while(temp> 0)
	         {
	        	 count++;
	        	 temp = temp /10;
	         }
	         temp = num;
	         while(temp > 0)
	         {
	        	 int r = temp % 10;
	        	 sum =sum +(int) Math.pow(r,count);
	        	 temp = temp/10;
	         }
	         if ( sum == num)
	         {
	        	 System.out.println("Armstrong number");
	         }
	         else
	         {
	        	 System.out.println("Not armstrong number");
	         }
}
}
