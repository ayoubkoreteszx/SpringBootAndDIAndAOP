package customers.Repositories;

import customers.Domain.Product;
import customers.Integration.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
private List<Product> products = new ArrayList<Product>();
@Autowired
private Logger logger;

    @Override
    public void save(Product product) {
        products.add(product);
        logger.log("Product is saved in the DB: "+ product.toString() );
    }

    @Override
    public void add(Product product) {
        products.add(product);
        logger.log("Product is added in the DB: "+ product.toString() );
    }
}
