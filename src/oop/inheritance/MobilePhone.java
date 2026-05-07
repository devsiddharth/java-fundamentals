package oop.inheritance;

public class MobilePhone extends Product{
    int cameraInPixels;
    float displaySize;

    MobilePhone(){
        super();
        System.out.println("MobilePhone constructor called");

    }

    public MobilePhone(int id, String name, int maxRetailPrice, float discountPercentage, float rating, int reviewsCount, String company, String category, int cameraInPixels, float displaySize) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewsCount, company, category);
        this.cameraInPixels = cameraInPixels;
        this.displaySize = displaySize;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Camera In Pixels: " + cameraInPixels);
        System.out.println("Display Size: " + displaySize);
    }
}