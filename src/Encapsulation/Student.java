package Encapsulation;

public class Student {
private int id;
private String name;
//Settters
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
//Getters
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public static void main(String[] args)
{
	Student s1 = new Student();
	s1.setId(101);
	s1.setName("Tom");
	System.out.println(s1.getId());
	System.out.println(s1.getName());
}
}

//short cut  = right click->source->get setters and getters -> all