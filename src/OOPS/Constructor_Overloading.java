package OOPS;

public class Constructor_Overloading {
int id;
String name;
int age;
public Constructor_Overloading()
{
	System.out.println("Student Constructor");
}
public Constructor_Overloading(int id)
{
	this.id = id;
}
public Constructor_Overloading(int id,String name)
{
	this.id = id;
	this.name=name;
}
public Constructor_Overloading(int id,String name,int age)
{
	this.id = id;
	this.name=name;
	this.age = age;
}
public static void main(String[] args)
{
	Constructor_Overloading s1 = new Constructor_Overloading();
	System.out.println(s1);
	Constructor_Overloading s2 = new Constructor_Overloading(1);
	System.out.println(s2.id);
	Constructor_Overloading s3 = new Constructor_Overloading(1,"John");
	System.out.println(s3.id);
	System.out.println(s3.name);
	Constructor_Overloading s4 = new Constructor_Overloading(1,"John",35);	
	System.out.println(s4.id);
	System.out.println(s4.name);
	System.out.println(s4.age);
}
}
