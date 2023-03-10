package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        try (context) {
//            Cat cat = context.getBean("cat", Cat.class);
//            cat.say();
            Person person = context.getBean("personBean", Person.class);
            System.out.println(person.getAge());
            System.out.println(person.getSurname());
        }
    }
}
