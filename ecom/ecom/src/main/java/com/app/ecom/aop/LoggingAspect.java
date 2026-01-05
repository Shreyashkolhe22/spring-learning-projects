package com.app.ecom.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log =
            LoggerFactory.getLogger(LoggingAspect.class);

    // Intercept all service methods
    @Around("execution(* com.app.ecom.service.*.*(..))")
    public Object logServiceMethods(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().toShortString();

        log.info("➡️ Entering method: {}", methodName);

        try {
            Object result = joinPoint.proceed();
            log.info("✅ Exiting method: {}", methodName);
            return result;
        } catch (Exception e) {
            log.error("❌ Exception in method: {}", methodName, e);
            throw e;
        }
    }
}
