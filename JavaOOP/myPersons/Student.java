package myPersons;

public class Student extends Person{
    private String isicNumber;

    public Student(String name, String isicNumber) {
        super(name);
        this.isicNumber=isicNumber;
    }

    public Student(String name, int age, String isicNumber) {
        super(name, age);
        this.isicNumber=isicNumber;
    }

    @Override
    public String toString() {
        return "Student{"+super.toString() +
                ", isicNumber='" + isicNumber + '\'' +
                '}';
    }
}
