package ru.philimonov.springcourse.spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hey my pet!!!");
        pet.say();
    }
}
