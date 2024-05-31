package customers.Services;

import customers.Integration.EmailSender;
import customers.Repositories.CustomerRepository;
import customers.Domain.Address;
import customers.Domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	EmailSender emailSender;

	public void addCustomer(String name, String email, String street,
			String city, String zip) {
		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);
		customer.setAddress(address);
		customerRepository.save(customer);
		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
	}
	//setter methods for customerRepository and emailSender
	/*@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Autowired
	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	 */


}
