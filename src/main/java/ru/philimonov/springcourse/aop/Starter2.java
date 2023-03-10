package ru.philimonov.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Starter2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        try (context) {
            University university = context.getBean("university", University.class);
            university.addStudents();
            try {
                List<Student> students = university.getStudents();
                System.out.println(students);
            } catch (Exception e) {
                System.out.println("было поймано исключение " + e);
            }
        }

    }
}
