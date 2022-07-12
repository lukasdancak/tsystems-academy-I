package cars;

public class Car implements Comparable<Car> {
    private String brand;
    private boolean started;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    @Override
    public String toString() {
        return brand + '(' +
                (started ? "started" : "stopped") +
                ')';
    }

    @Override
    public int compareTo(Car o) {
        if(o==null){return -1;}
        return this.getBrand().compareTo(o.getBrand());
    }
}