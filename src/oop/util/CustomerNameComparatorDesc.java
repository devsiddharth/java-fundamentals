package oop.util;

import oop.collections.Product;

import java.util.Comparator;

public class CustomerNameComparatorDesc implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.productName.compareTo(o1.productName);
    }
}
