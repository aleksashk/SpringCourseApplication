package ru.philimonov.springcourse.aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("We take the book from uniLibrary " + book.getName());
    }

    protected String returnBook(String name, int counter) {
        System.out.println("We return the book from uniLibrary!!!");
        return "Some String";
    }

    public void getMagazine() {
        System.out.println("We take the magazine from uniLibrary!!!");
    }
    public void getMagazine(int a, String b, Double c, Object o, Boolean bool) {
        System.out.println("We take the magazine from uniLibrary!!!");
    }
}
