package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            Person person = context.getBean("personBean", Person.class);

            person.callYourPet();
        }

    }
}
