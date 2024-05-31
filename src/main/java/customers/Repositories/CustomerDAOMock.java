package customers.Repositories;

import customers.Domain.Customer;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("test")
@Repository
public class CustomerDAOMock implements CustomerRepository {

    @Override
    public void save(Customer customer) {
        // TODO Auto-generated method stub
        System.out.println("CustomerDAOMock: save customer into test database: "+customer.getName());
    }
}
