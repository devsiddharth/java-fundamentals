package oop.util;

import oop.collections.Product;

import java.util.Comparator;

public class CustomerNameComparatorAsc implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.productName.compareTo(o2.productName);
    }

}
