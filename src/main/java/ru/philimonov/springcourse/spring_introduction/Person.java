package ru.philimonov.springcourse.spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Create empty bean Person");
    }

    public void callYourPet(){
        System.out.println("Hey my pet!!!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person added Pet!!!");
        this.pet = pet;
    }
}
