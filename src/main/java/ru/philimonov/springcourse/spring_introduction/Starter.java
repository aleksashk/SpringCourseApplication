package ru.philimonov.springcourse.spring_introduction;

public class Starter {
    public static void main(String[] args) {

        Pet petDog = new Dog();
        Pet petCat = new Cat();
        petDog.say();
        petCat.say();
    }
}
