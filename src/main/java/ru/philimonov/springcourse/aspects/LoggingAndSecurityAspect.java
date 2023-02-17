package ru.philimonov.springcourse.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* ru.philimonov.springcourse.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){
    }

    @Pointcut("execution(public void ru.philimonov.springcourse.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }

}
