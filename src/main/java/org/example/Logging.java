package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    // Cross-cutting concern: logging
    @AfterReturning(
            pointcut = "execution(* org.example.SampleAdd.add(..))",
            returning = "result",
            argNames = "joinPoint,result"
    )
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Logging: " + joinPoint.getSignature().getName() + " returned " + result);
    }
}
