package oop.collections.productAssigment;

import java.util.List;

public interface ProductService {
    Product save(Product product) throws ProductExistException;
    Product findById(int id) throws ProductNotFoundException;
    List<Product> findAll();
    Product update(Product product) throws ProductNotFoundException;
    void deleteById(int id) throws ProductNotFoundException;
    void delete(Product product) throws ProductNotFoundException;
}
