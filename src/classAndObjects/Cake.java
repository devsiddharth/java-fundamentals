package classAndObjects;

public class Cake {

    String flavour;
    int layers;
    boolean isEgless;

    void bake(){
        System.out.println("The "+ flavour+ " cake is baking right now in the oven!");
    }

    void displayDetails(){
        System.out.println("The flavour of the cake is: "+ flavour );
        System.out.println("The cake as "+ layers+ "layers");
        System.out.println("The cake is "+ isEgless);

    }
}
