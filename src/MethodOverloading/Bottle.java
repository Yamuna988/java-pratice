package MethodOverloading;
//Methodchaining
public class Bottle {
	private int capacity;
	private String color;
	public int getCapacity() {
		return capacity;
	}
	public Bottle setCapacity(int capacity) {
		this.capacity = capacity;
		return this;
	}
	public String getColor() {
		return color;
	}
	public Bottle setColor(String color) {
		this.color = color;
		return this;
	}
	
public static void main(String[] args)
{
	Bottle b = new Bottle();
	System.out.println(b.setCapacity(5).getCapacity());
	System.out.println(b.setColor("black").getColor());
}
}
