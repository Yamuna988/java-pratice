package HasArelationship;

// depending class
public class Car {

    private int id;
    private String brand;

    // dependent reference variable
    private Engine e = new Engine();

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

    public Engine getE() {
        return e;
    }

    public void setE(Engine e) {
        this.e = e;
    }
}