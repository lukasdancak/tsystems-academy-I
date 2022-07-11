package myPersons;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name=name;
    }

    public Person(String name, int age) {
        this.name = name;
        // check if age is valid
        if(isValidAge(age)) {this.age = age;} //else {this.age=0;}
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
        // check if age is valid
        if(isValidAge(age)) {this.age = age;} //else {this.age=0;}
    }

    private boolean isValidAge (int ageNew){
        return ageNew >=0 && ageNew<=150;
    }

//    @Override
//    public String toString() {
//        return "MyPerson{}: "+this.getName()+" "+this.getAge() ;
//    }


    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
