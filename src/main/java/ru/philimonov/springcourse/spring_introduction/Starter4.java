package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        try (context) {
            Dog dog1 = context.getBean("myPet", Dog.class);
            dog1.say();
        }

    }
}
