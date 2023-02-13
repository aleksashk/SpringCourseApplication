package ru.philimonov.springcourse.spring_introduction;

public class Cat implements Pet{

    public Cat() {
        System.out.println("Create bean Cat");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
