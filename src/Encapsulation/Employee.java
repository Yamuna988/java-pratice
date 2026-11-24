package Encapsulation;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private int age;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Tom");
		e1.setSalary(25000);
		e1.setAge(23);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getAge());
	}
}
