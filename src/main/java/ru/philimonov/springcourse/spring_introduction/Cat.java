package ru.philimonov.springcourse.spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Create bean Cat");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
