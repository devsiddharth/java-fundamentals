package oop.collections;

import oop.util.CustomerIdComparatorAsc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TypeSet {
    public static void main(String[] args) {
        HashSet<Product> hs = new HashSet<>();
        hs.add(new Product(1, "Cricket Bat", "10kjbbvkjsdc"));
        hs.add(new Product(2, "PS 5", "10kjsdbjwuet"));
        hs.add(new Product(3, "Samsung TV", "10kjccjwndsn"));
        hs.add(new Product(1, "Cricket Bat", "10kjbbvkjsdc"));

        System.out.println(hs);

        TreeSet<String> hs1 = new TreeSet<>();
        hs1.add("p4");
        hs1.add("p2");
        hs1.add("p3");
        hs1.add("p1");
        hs1.add("p1");
        System.out.println(hs1.size());
        System.out.println(hs1.remove("p2"));
        System.out.println(hs1);

        Iterator<String> iterator = hs1.iterator();
        while(iterator.hasNext()){
            //  System.out.println(iterator.next());
            String name  = iterator.next();
            System.out.println(name.toUpperCase());
        }

//        /*  Customer Set */
        TreeSet<Product> customerSet = new TreeSet<>(new CustomerIdComparatorAsc());
        customerSet.add(new Product(111,"p1","10kjbbvkjfjs"));
        customerSet.add(new Product(222,"p2","10kjbbvkjidj"));
        customerSet.add(new Product(555,"p5","10kjbbvkjksf"));

        customerSet.add(new Product(333,"p3","10kjbbvkjpym"));

        customerSet.add(new Product(444,"p4","10kjbbvkjoel"));
        customerSet.add(new Product(222,"p2","10kjbbvkjgqb"));


        System.out.println(customerSet);
    }
}
