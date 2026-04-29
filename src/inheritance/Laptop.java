package inheritance;

public class Laptop extends Product{
    int hardDiskSize;
    String operatingSystem;

    public Laptop() {
        // super(); //super call -> calling super class constructor
        System.out.println("Laptop constructor called");
    }

    public Laptop(int id, String name, int maxRetailPrice, float discountPercentage, float rating, int reviewsCount, String company, String category, int hardDiskSize, String operatingSystem) {
        super(id, name, maxRetailPrice, discountPercentage, rating, reviewsCount, company, category);
        this.hardDiskSize = hardDiskSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Hard Disk Size: " + hardDiskSize);
        System.out.println("Operating System: " + operatingSystem);
    }

    @Override
    public void displayDetails(String hardDiskSize, String operatingSystem){
        System.out.println("Hard Disk Size : " + hardDiskSize);
        System.out.println("Operating System : " + operatingSystem);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                ", discountPercentage=" + discountPercentage +
                ", rating=" + rating +
                ", reviewsCount=" + reviewsCount +
                ", company='" + company + '\'' +
                ", category='" + category + '\'' +
                ",hardDiskSize=" + hardDiskSize +
                ", operatingSystem='" + operatingSystem + '\'' +

                '}';
    }
}