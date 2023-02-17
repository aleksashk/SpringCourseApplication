package ru.philimonov.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            uniLibrary.getBook();
            uniLibrary.returnMagazine();
            uniLibrary.addBook();
        }
    }
}
