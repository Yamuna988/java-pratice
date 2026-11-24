package Number_problems;
import java.util.Scanner;
public class digits_products {

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        int product = 1;

		        while (num > 0) {
		            int r = num % 10;
		            product  = product * r;
		            num = num / 10;
		        }

		        System.out.println("product of digits = " + product);

		        sc.close();
		    }
		}
