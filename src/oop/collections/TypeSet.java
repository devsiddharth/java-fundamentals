package oop.collections;

import java.util.HashSet;

public class TypeSet {
    public static void main(String[] args) {
        HashSet<Product> hs = new HashSet<>();
        hs.add(new Product(1, "Cricket Bat", "10kjbbvkjsdc"));
        hs.add(new Product(2, "PS 5", "10kjsdbjwuet"));
        hs.add(new Product(3, "Samsung TV", "10kjccjwndsn"));
        hs.add(new Product(1, "Cricket Bat", "10kjbbvkjsdc"));

        System.out.println(hs);
    }
}
