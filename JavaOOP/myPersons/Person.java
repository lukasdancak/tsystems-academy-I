package myPersons;

import cars.Car;

public abstract class Person {
    public static final String JAHODA = "Jahoda";
    private String name; // = null;
    private int age; // = 0;
    private Car car;

    public Person(String name) {
        this(name, 5);
    }

    public Person(String name, int age) {
        this.name = name;
        if(isValidAge(age)) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(isValidAge(age)) {
            this.age = age;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private boolean isValidAge(int ageNew) {
        return ageNew >= 0 && ageNew <= 150;
    }
    public boolean isCar() {
        if(car==null){return false;} else {return true;}
    }



    @Override
    public String toString() {
        if(this.getCar()!=null){this.getCar().start();}
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                (car != null ? ", car=" + car : "") +
                '}';
    }

    public String print(){
        if(this.isCar()){this.getCar().start();}
        return this.toString();
    }

//    abstract public void print();
}