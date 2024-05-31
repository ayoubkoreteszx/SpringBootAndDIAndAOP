package bank.AOP;

import bank.integration.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class BankDAOAdviser {
    @Autowired
    private Logger logger;

    @After("execution(* bank.repository.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.log("method = " + joinPoint.getSignature().getName());
    }
}
