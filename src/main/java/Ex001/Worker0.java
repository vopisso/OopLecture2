package Ex001;

public class Worker0 {

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker0(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return  String.format("%s %s", firstName, lastName);
    }
}
