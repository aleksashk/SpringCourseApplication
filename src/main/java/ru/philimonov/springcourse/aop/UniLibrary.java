package ru.philimonov.springcourse.aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from uniLibrary!");
    }

    public void addBook() {
        System.out.println("We add the book to uniLibrary!");
    }

    public void addMagazine() {
        System.out.println("We add the magazine to uniLibrary!");
    }

    public void returnBook() {
        System.out.println("We return the book from uniLibrary!!!");
    }

    public void getMagazine() {
        System.out.println("We take the magazine from uniLibrary!!!");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine to uniLibrary!!!");
    }
}
