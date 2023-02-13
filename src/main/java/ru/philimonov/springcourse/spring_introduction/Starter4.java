package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog1 = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());
        dog1.setName("Name for pet1");
        dog2.setName("PET2");
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

    }
}
