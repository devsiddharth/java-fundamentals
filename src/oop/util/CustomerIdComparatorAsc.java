package oop.util;

import oop.collections.Product;

import java.util.Comparator;

public class CustomerIdComparatorAsc implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.id, o2.id);
    }
}
