package ru.philimonov.springcourse.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        try (context) {
            Cat cat = context.getBean("catBean", Cat.class);
            cat.say();
        }
    }
}
