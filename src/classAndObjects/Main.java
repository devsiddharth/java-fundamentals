package classAndObjects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Cake newCake = new Cake();

//        car.color = "Red";
//        car.company = "VolksWagen";
//        car.model = "Polo";
//
//        car.myCar();

        newCake.flavour = "Red velvet";
        newCake.layers = 3;
        newCake.isEgless = false;

        newCake.displayDetails();
        newCake.bake();


    }
}
