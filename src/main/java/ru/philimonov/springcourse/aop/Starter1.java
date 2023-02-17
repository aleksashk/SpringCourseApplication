package ru.philimonov.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            Book book = context.getBean("book", Book.class);
            uniLibrary.getBook(book, true);
//            uniLibrary.returnBook("Flameksandr", 32);
//            uniLibrary.getMagazine();
//            uniLibrary.getMagazine(12, "String b", .25, 4, true);
//            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//            schoolLibrary.getBook();
        }
    }
}
