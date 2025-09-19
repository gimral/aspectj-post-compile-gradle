package com.example;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Around("execution(* com.example.TransactionProcessor.process(..))")
    public void dummyPointcut() {
        System.out.println("Logging transaction.");
    }
}
