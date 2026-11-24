package OOPS;

public class Constructor_Chaining {
int id;
String name;
int age;
public Constructor_Chaining()
{
	System.out.println("Student Constructor");
}
public Constructor_Chaining(int id)
{
	this();
	this.id=id;
}
public Constructor_Chaining(int id,String name)
{
	this(id);
	this.name=name;
}
public Constructor_Chaining(int id,String name,int age)
{
	this(id,name);
	this.age = age;
}
public static void main(String[] args)
{
	Constructor_Chaining s1 = new Constructor_Chaining(1,"tom",20);
	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s1.age);
}
}
