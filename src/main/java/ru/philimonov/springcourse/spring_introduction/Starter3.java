package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.property");
//        Pet pet = new Dog();
//        Person person = new Person(pet);
        Pet myPet = context.getBean("myPet", Pet.class);
        Person person = new Person(myPet);
        person.callYourPet();

        context.close();
    }
}
