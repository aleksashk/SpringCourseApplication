package ru.philimonov.springcourse.spring_introduction;

public class Dog implements Pet{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog() {
        this.name = "unknown";
        System.out.println("Create bean Dog");
    }

    @Override
    public void say(){
        System.out.println("Wow-wow");
    }
}
