package myPersons;

import cars.PersonalCar;
import cars.Truck;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Jozko", 25),
                new Person("Janko"),
                new Person("Fero", 200),
                new Employee("Matus", 60, "maliar"),
                new Student("Marian", "6513215"),
                new Student("Milan", 44, "3135151"),
                new Employee("Matus", 56, "dekan")
        };


        System.out.println(persons[0] instanceof Comparable<?>); // dolezite

        Arrays.sort(persons);
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();

//       Person person1 = new Person("Jozko", 25);
//       Person person2 = person1;
//       person1.setName("Miro");
//       System.out.println(person1);
//       System.out.println(person2);

//        Student student1 = new Student("Jozef", 22, "56456");
//        Employee employee1 = new Employee("Fero", 55, "dekan");
//        System.out.println(student1);
//        System.out.println(employee1);

//        Student student1 = new Student("Jozef", 22, "56456");
//        Employee employee1 = new Employee("Fero", 55, "dekan");
//        Truck tatra = new Truck("Tatra");
//        PersonalCar  skoda = new PersonalCar("Skoda",5);
//        student1.setCar(tatra);
//        employee1.setCar(skoda);
//
//        tatra.setLoad("piesok");
//        ((Truck) student1.getCar()).setLoad("strk");
//
//        System.out.println( student1.print());
//        System.out.println(employee1.print());


    }
}
