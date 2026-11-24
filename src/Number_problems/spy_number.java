package Number_problems;
import java.util.Scanner;
public class spy_number {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
			        System.out.print("Enter a number: ");
			        int num = sc.nextInt();
			        int sum = 0;
                    int product = 1;
			        while (num > 0) {
			            int r = num % 10;
			            sum = sum + r;
			            product  = product * r;
			            num = num / 10;
			        }
			        if (sum == product )
			        {
			        	
			        System.out.println("spy number");
   }
			        else
			        {
			        	System.out.println("Not a spy number");
			    
			        }
			        sc.close();		        
			    }
}
			  
//SPY NUMBER MEANS 
// SUM OF DIGITS == PRODUCT OF DIGITS
