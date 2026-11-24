package HasArelationship;

public class Engine {
	//dependent class
		private int id;
		private String brand;
		private double hp;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getHp() {
			return hp;
		}
		public void setHp(double hp) {
			this.hp = hp;
		}
		public static void main(String[] args)
		{
		Car c = new Car();
		c.setId(1);
		c.setBrand("BMW");
		//engine properties
		System.out.println("Car Details");
		c.getE().setId(101);
		c.getE().setBrand("KW10");
		c.getE().setHp(1500);
		System.out.println(c.getId()+" "+c.getBrand());
		System.out.println("Engine Details");
		System.out.println(c.getE().getId()+" "+c.getE().getBrand()+" "+c.getE().getHp());
	}
	}

