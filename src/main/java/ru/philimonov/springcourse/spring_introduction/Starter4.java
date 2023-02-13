package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Pet pet1 = context.getBean("myPet", Pet.class);
        Pet pet2 = context.getBean("myPet", Pet.class);
        System.out.println("pet1 = pet2 -> " + (pet1 == pet2));
        System.out.println(pet1);
        System.out.println(pet2);

    }
}
