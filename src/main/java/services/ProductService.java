package services;

import java.util.List;

import model.Product;

public interface ProductService {

    
    public List<Product> getAllProducts();
    
    public Product create(Product product);
    
    public void deleteProduct(long id) throws Exception;
}
