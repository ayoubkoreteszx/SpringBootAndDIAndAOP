package customers.AOP;

import customers.Integration.EmailSender;
import customers.Integration.EmailSenderImpl;
import customers.Integration.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class EmailAfterAdvice {
  @Autowired
    Logger logger;
    @After("execution(* customers.Integration.EmailSender.sendEmail(..)) && args(email, message)")
    public void logAfter(JoinPoint joinPoint, String email, String message){
        EmailSender emailSender=(EmailSender) joinPoint.getTarget();
        logger.log("method = sentEmail  email= "+email+" \n message= "+message+" outgoing mail server\n" +
                " =" +emailSender.getOutgoingMailServer());
    }

}
