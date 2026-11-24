package Package1;
import java.util.*;
public class StudentDetails {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name: ");
	String name = sc.next();
	System.out.println("Enter college name: ");
	sc.nextLine();
	String college = sc.nextLine();
	System.out.println("Enter age: ");
	int age = sc.nextInt();
	System.out.println("Enter Weight: ");
	double weight = sc.nextDouble();
	System.out.println("Enter Height: ");
	double height = sc.nextDouble();
	System.out.println("Enter Attendance: ");
	char attendance = sc.next().charAt(0);
	System.out.println("Enter email: ");
	String email = sc.next();
	System.out.println("Enter phone: ");
	long phone = sc.nextLong();
	System.out.println(name);
	System.out.println(age);
	System.out.println(weight);
	System.out.println(height);
	System.out.println(attendance);
	System.out.println(email);
	System.out.println(phone);
}
}
