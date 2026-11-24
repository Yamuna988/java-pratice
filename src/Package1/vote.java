package Package1;

import java.util.Scanner;

public class vote {
	    public static void main(String[] args) {

	        int age;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter age = ");
	         age = sc.nextInt();

	        if (age >= 18) {
	            System.out.println("Eligible");
	        }
	        else {
	            System.out.println("Not Eligible");
	        }
	    }
	}

