package oop.streams;

import oop.streams.model.Product;
import oop.streams.repository.ProductRepository;
import oop.streams.service.ProductServiceImpl;
import oop.streams.util.CsvReader;

import java.io.IOException;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main{
    public static void main(String[] args){
        Product product = new Product();
        try {
            CsvReader csvReader = new CsvReader();
            ProductRepository productRepository = new ProductRepository(csvReader);
            ProductServiceImpl productServiceImpl = new ProductServiceImpl(productRepository);

//          List<Product> products =   productServiceImpl.getAllGreaterThanPrice(80000);
//            System.out.println(products);
//            List<String> productName = productServiceImpl.getAllProdctsNames();
//            System.out.println(productName);
//            long count = productServiceImpl.getAllProductsCount();
//            System.out.println(count);
//            Optional<Product> prodcut = productServiceImpl.getProductOnGivenCompany("LG");
//            System.out.println(prodcut);
//            if(productServiceImpl.isAllProductsAvailable()){
//                System.out.println("All Available");
//            }else{
//                System.out.println("All Not Available");
//            }
//            List<String> categories = productServiceImpl.getAllUniqueCategories();
//            System.out.println(categories);
//            List<Product> products = productServiceImpl.getTopNMostExpensive(5);
//            System.out.println(products);
//            System.out.println(productServiceImpl.getAllProductPriceSum());
//            System.out.println(productServiceImpl.getTotalPriceAfterDiscount(3));
//            System.out.println(productServiceImpl.getCountByCategory());
//            System.out.println(productServiceImpl.getAllAvailableAndGraeterPrice(500));
//            System.out.println(productServiceImpl.getProductsByCompany());

        }
        catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}