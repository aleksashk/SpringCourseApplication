package ru.philimonov.springcourse.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    public Person() {
//        System.out.println("Create empty bean Person");
//    }

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Create empty bean Person");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hey my pet!!!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person set Pet!!!");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
