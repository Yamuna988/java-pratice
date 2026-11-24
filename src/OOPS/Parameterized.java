package OOPS;

public class Parameterized {
public static void main(String[] args)
{
	Student s1 = new Student(1,"John",35);
	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s1.age);
	Student s2 = new Student(2,"Smith",25);
	System.out.println(s2.id);
	System.out.println(s2.name);
	System.out.println(s2.age);
}
}
