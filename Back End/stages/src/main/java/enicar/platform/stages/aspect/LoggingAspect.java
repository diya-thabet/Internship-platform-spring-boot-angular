package enicar.platform.stages.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Pointcut for all public methods in controller package with @GetMapping
    @Pointcut("within(enicar.platform.stages.controller..*) && @annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void controllerMethods() {}

    // Before advice to log method entry and arguments
    @Before("controllerMethods()")
    public void logMethodEntry(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toShortString();
        Object[] args = joinPoint.getArgs();
        logger.info("Entering method: {} with arguments: {}", methodName, Arrays.toString(args));
    }

    // AfterReturning advice to log method exit and result
    @AfterReturning(pointcut = "controllerMethods()", returning = "result")
    public void logMethodExit(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().toShortString();
        if (result instanceof java.util.List) {
            logger.info("Exiting method: {} with result: {} items", methodName, ((java.util.List<?>) result).size());
        } else {
            logger.info("Exiting method: {} with result: {}", methodName, result);
        }
    }

    // AfterThrowing advice to log exceptions
    @AfterThrowing(pointcut = "controllerMethods()", throwing = "exception")
    public void logMethodException(JoinPoint joinPoint, Throwable exception) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.error("Exception in method: {} - {}", methodName, exception.getClass().getSimpleName(), exception);
    }

    // Around advice to log execution time
    @Around("controllerMethods()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        String methodName = joinPoint.getSignature().toShortString();

        try {
            Object result = joinPoint.proceed();
            long endTime = System.nanoTime();
            long durationMs = (endTime - startTime) / 1_000_000;
            logger.info("Method: {} executed in {} ms", methodName, durationMs);
            return result;
        } catch (Throwable t) {
            long endTime = System.nanoTime();
            long durationMs = (endTime - startTime) / 1_000_000;
            logger.error("Method: {} failed after {} ms with exception: {}", methodName, durationMs, t.getClass().getSimpleName());
            throw t;
        }
    }
}