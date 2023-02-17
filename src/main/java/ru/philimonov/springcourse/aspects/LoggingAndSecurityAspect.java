package ru.philimonov.springcourse.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Before("execution(* get*())")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу/magazine!!!");
    }

    @Before("execution(* get*())")
    public void beforeGetSecurityAdvice() {
        System.out.println("проверка прав на получение книги или журнала");
    }
}
