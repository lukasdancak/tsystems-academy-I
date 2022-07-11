package cars;

public class Truck extends Car{
    String load;


    public Truck(String brand) {
        super(brand);

    }
    public Truck(String brand, String load) {
        super(brand);
        this.load = load;
    }

    public void unload() {
        this.load = null;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{"+super.toString() +
                ", load='" + load + '\'' +
                '}';
    }
}
