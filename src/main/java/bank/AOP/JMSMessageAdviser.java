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
public class JMSMessageAdviser {
    @Autowired
    private Logger logger;
    @Before("execution(* bank.integration.jms.JMSSender.sendJMSMessage(..)) && args(msg)")
    public void logAfter(String msg) {
        logger.log("JMSMessageAdviser: sending JMS message ="+msg);
    }
}
