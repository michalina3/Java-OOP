package pl.coderslab.oop.constructor;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    enum Gender{
        MALE,
        FEMALE,
        OTHER
    }
}
