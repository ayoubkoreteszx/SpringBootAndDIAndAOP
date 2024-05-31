package customers;

import customers.Domain.Product;
import customers.Services.CustomerService;
import customers.Services.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab2PartAApplication implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ServiceProduct productService;
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Lab2PartAApplication.class, args);
        context.close();
    }

    @Override
    public void run(String... args) throws Exception {
    //    productService.addProduct(new Product(" Spring Book", 10.0));
        customerService.addCustomer("Frank Brown", "fbrown@acme.com", "mainstreet 5", "Chicago", "60613");
    }
}
