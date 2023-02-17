package ru.philimonov.springcourse.aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("We take the book from uniLibrary!!!");
    }

    public String returnBook(){
        System.out.println("We return the book from uniLibrary!!!");
        return "Some String";
    }
    public void getMagazine(){
        System.out.println("We take the magazine from uniLibrary!!!");
    }
}
