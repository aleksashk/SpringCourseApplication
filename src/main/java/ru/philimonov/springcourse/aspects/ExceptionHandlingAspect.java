package ru.philimonov.springcourse.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("ru.philimonov.springcourse.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGEtExceptionHandlingAdvice: ловим/обрабатываем исключения при попытке получить книгу/журнал");
        System.out.println("---------------------------------------------");

    }
}
