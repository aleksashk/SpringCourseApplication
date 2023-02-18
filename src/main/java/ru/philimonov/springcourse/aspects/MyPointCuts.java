package ru.philimonov.springcourse.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* asfd*(..))")
    public void allAddMethods(){}
}
