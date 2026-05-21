package oop.collections.productAssigment;

import oop.collections.productAssigment.InputUtil.InputUtil;

public class ProductUI {
    private ProductController handler;

    public ProductUI() {
        controller = new ProductController();
    }

    public void start() {
        while (true) {
            System.out.println("\n===== PRODUCT MANAGEMENT =====");
            System.out.println("1. Save new product");
            System.out.println("2. Find product by ID");
            System.out.println("3. Show all products");
            System.out.println("4. Update a product");
            System.out.println("5. Delete product by ID");
            System.out.println("6. Delete product by object");
            System.out.println("7. Exit");

            int choice = InputUtil.readInt("Choose an option: ");

            try {
                if (choice == 1) {
                    handler.saveProduct();
                } else if (choice == 2) {
                    handler.findProductById();
                } else if (choice == 3) {
                    handler.showAllProducts();
                } else if (choice == 4) {
                    handler.updateProduct();
                } else if (choice == 5) {
                    handler.deleteProductById();
                } else if (choice == 6) {
                    handler.deleteProductByObject();
                } else if (choice == 7) {
                    System.out.println("Exiting...");
                    InputUtil.close();
                    return;
                } else {
                    System.out.println("Invalid option. Try again.");
                }
            } catch (ProductExistException | ProductNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        ProductUI ui = new ProductUI();
        ui.start();
    }
}
