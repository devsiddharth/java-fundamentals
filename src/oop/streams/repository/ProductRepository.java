package oop.streams.repository;

import oop.streams.model.Product;
import oop.streams.util.CsvReader;

import java.io.IOException;
import java.util.List;

public class ProductRepository {
    private final CsvReader csvReader;
    private final List<Product> products;

    public ProductRepository(CsvReader csvReader) throws IOException {
        this.csvReader = csvReader;
        this.products = this.csvReader.getProductsFromCsv();
    }

    public List<Product> findAll(){
        return products;
    }
}
