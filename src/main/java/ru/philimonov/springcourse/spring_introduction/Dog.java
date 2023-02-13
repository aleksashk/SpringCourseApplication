package ru.philimonov.springcourse.spring_introduction;

public class Dog implements Pet{

    public Dog() {
        System.out.println("Create bean Dog");
    }

    @Override
    public void say(){
        System.out.println("Wow-wow");
    }
}
