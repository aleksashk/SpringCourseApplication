package ru.philimonov.springcourse.aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook(String bookName) {
        System.out.println("We take the book from uniLibrary " + bookName);
    }

    protected String returnBook(String name, int counter) {
        System.out.println("We return the book from uniLibrary!!!");
        return "Some String";
    }

    public void getMagazine() {
        System.out.println("We take the magazine from uniLibrary!!!");
    }
}
