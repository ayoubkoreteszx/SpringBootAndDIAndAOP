package customers.Services;

import customers.Domain.Product;
import customers.Integration.EmailSenderImpl;
import customers.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ServiceProduct")
public class ServiceProduct {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private EmailSenderImpl emailSender;


    public void addProduct(Product product) {
        productRepository.add(product);
        productRepository.save(product);
        emailSender.sendEmail(" product is saved in the DB: ", product.toString());
    }
}
