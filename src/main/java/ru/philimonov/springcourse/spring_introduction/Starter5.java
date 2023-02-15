package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            Person person = context.getBean("personBean", Person.class);
            person.callYourPet();

//            Pet cat1 = context.getBean("catBean", Pet.class);
//            Pet cat2 = context.getBean("catBean", Pet.class);
//            System.out.println("cat1 = cat2 ->" + (cat1 == cat2));
        }

    }
}
