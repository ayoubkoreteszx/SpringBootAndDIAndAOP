package customers.Repositories;

import customers.Domain.Customer;
import customers.Integration.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class CustomerRepositoryImpl implements CustomerRepository{

	@Autowired
	private Logger logger;

	/*
	@Autowired
	public CustomerRepositoryImpl(Logger logger) {
		super();
		this.logger = logger;
	}

	 */

	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerRepository: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
	}

}
