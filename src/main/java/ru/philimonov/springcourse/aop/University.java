package ru.philimonov.springcourse.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Fl Aleksandr", 4, 9.7);
        Student st2 = new Student("Jonson Aleksandr", 2, 5.3);
        Student st3 = new Student("Grinch Aleksandr", 1, 6.8);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
