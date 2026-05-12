package oop.collections;

import java.util.Objects;

public class Product {
    int id;
    String productName;
    String productSerialNumber;

    public Product(int id, String productName, String productSerialNumber) {
        this.id = id;
        this.productName = productName;
        this.productSerialNumber = productSerialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productSerialNumber='" + productSerialNumber + '\'' +
                '}';
    }
}

