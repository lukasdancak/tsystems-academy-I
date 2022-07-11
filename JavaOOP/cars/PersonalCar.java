package cars;

public class PersonalCar extends Car{
    final int NUMBER_OF_SEATS;

    public PersonalCar(String brand, int NUMBER_OF_SEATS) {
        super(brand);
        this.NUMBER_OF_SEATS = NUMBER_OF_SEATS;
    }

    public int getNUMBER_OF_SEATS() {
        return NUMBER_OF_SEATS;
    }

    @Override
    public String toString() {
        return "PersonalCar{"+super.toString() +
                ", NUMBER_OF_SEATS=" + NUMBER_OF_SEATS +
                '}';
    }
}
