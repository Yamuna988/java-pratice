package IsArelationship;

public class childs extends parents{
	public childs() {
		super();
	}
	public childs(int x,String y) {
		super(x,y);
	}
int z;
public void add()
{
	System.out.println("Add non static method");
}
public static void main(String[] args)
{
	childs c = new childs(1,"Donkey");
	//System.out.println(c.z);
	//c.add();
	//parent properties
	System.out.println(c.x);
	System.out.println(c.y);
	//c.demo();
}
}
