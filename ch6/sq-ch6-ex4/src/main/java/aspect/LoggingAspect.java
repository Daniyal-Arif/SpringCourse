package aspect;

import model.Comment;
import annotations.ToLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable { // ProceedingJoinPoint represents the intercepted method

        // obtains the name and parameters of the intercepted method
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute.");

        Comment comment = new Comment();
        comment.setAuthor("new author");
        comment.setText("new text");
        Object[] newArguments = {comment};

        Object returnedByMethod = joinPoint.proceed(newArguments); // calls the intercepted method

        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }
}