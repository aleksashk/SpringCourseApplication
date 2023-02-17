package ru.philimonov.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            uniLibrary.getBook();
            uniLibrary.returnBook("Flameksandr", 32);
            uniLibrary.getMagazine();
            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
            schoolLibrary.getBook();
        }
    }
}
