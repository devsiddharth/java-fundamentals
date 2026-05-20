package oop.collections.productAssigment;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> storage = new ArrayList<>();

    public Product save(Product product) throws ProductExistException {
        for (Product p : storage) {
            if (p.getId() == product.getId()) {
                throw new ProductExistException("Product with id " + product.getId() + " already exists.");
            }
        }
        storage.add(product);
        return product;
    }

    public Product findById(int id) throws ProductNotFoundException {
        for (Product p : storage) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new ProductNotFoundException("Product with id " + id + " not found.");
    }

    public List<Product> findAll() {
        return new ArrayList<>(storage);
    }

    public Product update(Product product) throws ProductNotFoundException {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getId() == product.getId()) {
                storage.set(i, product);
                return product;
            }
        }
        throw new ProductNotFoundException("Cannot update. Product with id " + product.getId() + " not found.");
    }

    public void deleteById(int id) throws ProductNotFoundException {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getId() == id) {
                storage.remove(i);
                return;
            }
        }
        throw new ProductNotFoundException("Cannot delete. Product with id " + id + " not found.");
    }

    public void delete(Product product) throws ProductNotFoundException {
        deleteById(product.getId());
    }
}
