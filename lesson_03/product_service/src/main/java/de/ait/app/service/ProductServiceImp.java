package de.ait.app.service;

import de.ait.app.entity.Product;
import de.ait.app.reposytory.ProductReposytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImp implements ProductService {
    private final ProductReposytory reposytory;

    @Autowired
    public ProductServiceImp(ProductReposytory reposytory) {
        this.reposytory = reposytory;
    }


    @Override
    public List<Product> getAllProducts() {
        return reposytory.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return reposytory.findAll()
                .stream()
                .filter(product -> product.getId().equals(id))
                .findAny()
                .get();
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }
}
