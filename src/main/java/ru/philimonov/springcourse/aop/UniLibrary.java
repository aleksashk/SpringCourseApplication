package ru.philimonov.springcourse.aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from uniLibrary!");
        System.out.println("---------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add the book to uniLibrary!");
        System.out.println("---------------------------------------------");

    }

    public void addMagazine() {
        System.out.println("We add the magazine to uniLibrary!");
        System.out.println("---------------------------------------------");

    }

    public String returnBook() {
        System.out.println(10 / 0);
        System.out.println("We return the book from uniLibrary!!!");
        return "Some book's title!";
    }

    public void getMagazine() {
        System.out.println("We take the magazine from uniLibrary!!!");
        System.out.println("---------------------------------------------");

    }

    public void returnMagazine() {
        System.out.println("We return the magazine to uniLibrary!!!");
        System.out.println("---------------------------------------------");

    }
}
