package customers.Integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderImpl implements EmailSender {

	// inject this value from properties
	@Value("${ongoingMailServer}")
	public String outgoingMailServer;

	@Autowired
	private Logger logger ;

	public String getOutgoingMailServer() {
		return outgoingMailServer;
	}
	public void sendEmail (String email, String message){
		System.out.println("EmailSender: sending  from "+getOutgoingMailServer()+" message+ to "+email );
		logger.log("Email is sent: message= "+message +" , emailaddress ="+ email  );
	}

}
