package Number_problems;

import java.util.Scanner;
public class automorphic_number {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
					        System.out.print("Enter a number: ");
					        int num = sc.nextInt();
					        int square = num * num;
					        int temp = square;
					        int n=10;
					        int flag = 0 ;
					        while(temp>0)
					        {
					        	int r = square%n;
					        	if(r == num)
					        	{
					        		flag = 1;
					        		break;
					        	}
					        	square = square/10;
					        	n = n*10;
					        }
					        if(flag == 1)
					        {
					        	System.out.println("Automorphic number");
					        }
					        else
					        {
					        	System.out.println("Not Automorphic number");
					        }
}
}

