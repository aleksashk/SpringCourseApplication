package ru.philimonov.springcourse.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void *(..))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу!!!");
    }

    @Before("execution(String returnBook(String, int))")
    public void beforeReturnBookAdvice() {
        System.out.println("------------------------------");
    }
}
