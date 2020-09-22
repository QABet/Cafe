package staff;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    enum Gender {
        MALE, FEMALE
    }

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
}
