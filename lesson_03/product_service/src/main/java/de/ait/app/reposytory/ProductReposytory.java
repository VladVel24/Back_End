package de.ait.app.reposytory;

import de.ait.app.entity.Product;

import java.util.List;

public interface ProductReposytory {

    List<Product> findAll();
    Product save (Product product);
    Product delete (Product product);
}
