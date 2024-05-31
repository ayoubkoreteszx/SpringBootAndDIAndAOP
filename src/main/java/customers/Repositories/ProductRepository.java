package customers.Repositories;

import customers.Domain.Product;

public interface  ProductRepository {

        void save(Product product) ;
        void add(Product product);
}
