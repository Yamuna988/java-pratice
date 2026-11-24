package Number_problems;
import java.util.Scanner;
public class neon_number {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
					        System.out.print("Enter a number: ");
					        int num = sc.nextInt();
					        int sum = 0;
					        int square = num * num;
					        while(square> 0)
					        {     
					        int r = square % 10;
					        sum = sum  + r;
					        square = square /10;
					        }
					        if(sum == num)
					        {
					        	System.out.println("neon number");
					        }
					        else
					        {
					        	System.out.println("not a neon number");
					        }
					        
}
}


//NEON NUMBER =
//NUMBER = 9
//SQUARE = 81
//SUM OF DIGITS IN THE SQUARE = 8 + 1
//IF SUM OF DIGITS OF SQUARE == NUMBER ITSELF THEN NEON NUMBER 