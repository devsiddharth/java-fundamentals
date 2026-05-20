package oop.collections.productAssigment;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository repository;

    public ProductServiceImpl() {
        this.repository = new ProductRepository();
    }

    @Override
    public Product save(Product product) throws ProductExistException {
        return repository.save(product);
    }

    @Override
    public Product findById(int id) throws ProductNotFoundException {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product update(Product product) throws ProductNotFoundException {
        return repository.update(product);
    }

    @Override
    public void deleteById(int id) throws ProductNotFoundException {
        repository.deleteById(id);
    }

    @Override
    public void delete(Product product) throws ProductNotFoundException {
        repository.delete(product);
    }
}