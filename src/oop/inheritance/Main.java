package oop.inheritance;

public class Main {
    public static void main(String[] args) {
      /*  Product product = new Product();
        System.out.println("Id : " + product.id + " Name : " + product.name );
      */
        Laptop laptop = new Laptop();
        System.out.println("Id : " + laptop.id + " Name : " + laptop.name);
        System.out.println("Operating System : " + laptop.operatingSystem + " HardDiskSize : " + laptop.hardDiskSize);
        MobilePhone phone = new MobilePhone();
        System.out.println("Id : " + phone.id + " Name : " + phone.name);
        System.out.println("Camera In Pixels : " + phone.cameraInPixels );

        Laptop laptop2 = new Laptop(2,"Dell Laptop",1000,10,4.5f,100,"Dell","Laptop",1024,"Windows");
        laptop2.displayDetails();

        MobilePhone phone2 = new MobilePhone(2,"Samsung Galaxy",1000,10,4.5f,100,"Samsung","MobilePhone",1024,5.5f);
        phone2.displayDetails();
    }
}