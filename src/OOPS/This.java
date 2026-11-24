package OOPS;

public class This {
	int id;
	String name;
	int age;
	public This(int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}


public static void main(String[] args)
{
	Student s1 = new Student(1,"John",35);
	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s1.age);
}
}
