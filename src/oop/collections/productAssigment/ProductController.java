package oop.collections.productAssigment;

import oop.collections.productAssigment.InputUtil.InputUtil;

import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        productService = new ProductServiceImpl();
    }

    public void saveProduct() {
        int id = InputUtil.readInt("Enter product id: ");
        String name = InputUtil.readString("Enter product name: ");
        double price = InputUtil.readDouble("Enter product price: ");
        Product product = new Product(id, name, price);
        productService.save(product);
        System.out.println("Product saved successfully: " + product);
    }

    public void findProductById() {
        int id = InputUtil.readInt("Enter product id to search: ");
        Product product = productService.findById(id);
        System.out.println("Found: " + product);
    }

    public void showAllProducts() {
        List<Product> products = productService.findAll();
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("All products:");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    public void updateProduct() {
        int id = InputUtil.readInt("Enter product id to update: ");
        Product existing = productService.findById(id);
        String newName = InputUtil.readString("Enter new name (current: " + existing.getName() + "): ");
        double newPrice = InputUtil.readDouble("Enter new price (current: " + existing.getPrice() + "): ");
        Product updatedProduct = new Product(id, newName, newPrice);
        productService.update(updatedProduct);
        System.out.println("Product updated: " + updatedProduct);
    }

    public void deleteProductById() {
        int id = InputUtil.readInt("Enter product id to delete: ");
        productService.deleteById(id);
        System.out.println("Product with id " + id + " deleted.");
    }

    public void deleteProductByObject() {
        int id = InputUtil.readInt("Enter product id to delete (by object): ");
        Product product = productService.findById(id);
        productService.delete(product);
        System.out.println("Product deleted via object: " + product);
    }
}
