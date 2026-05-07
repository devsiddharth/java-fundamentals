package oop.inheritance;

public class Product {

    //Base Class
    //common properties
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    int reviewsCount;
    String company;
    String category;

    Product(){
        System.out.println("Product constructor called");
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, int reviewsCount, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.company = company;
        this.category = category;
    }

    public void displayDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max Retail Price : " + maxRetailPrice);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);
        System.out.println("Reviews Count : " + reviewsCount);
        System.out.println("Company : " + company);
        System.out.println("Category : " + category);
    }

    public void displayDetails(String company){
        System.out.println("Displaying product details for company: " + company);
    }
    public void displayDetails(String company, String category){
        System.out.println("Displaying product details for company: " + company + " and category: " + category);
    }
    public void displayDetails(String company, String category, int year){
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", discountPercentage=" + discountPercentage +
                ", rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", company='" + company + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}