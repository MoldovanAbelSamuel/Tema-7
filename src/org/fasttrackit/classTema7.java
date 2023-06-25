package org.fasttrackit;

public class classTema7 {
    public static void main(String[] args) {
        Person pers1 = new Person("George", 25, true);
        Person pers2 = new Person("Alina", 40, true);
        Person pers3= new Person("Ion", 18, false);
        System.out.println(pers1);
        System.out.println(pers2);
        System.out.println(pers3);

        Product productOne = new Product("Mere", 9.99, 5, "Fructe");
        Product productTwo = new Product("Arahide", 15, 100, "Alune");
        Product productThree = new Product("Suc", 8.5, 0, "Lichide");

        Product[] exercitii = new Product[]{productOne, productTwo, productThree};
        for (int i=0; i< exercitii.length; i++){
            System.out.println("Product " + (i + 1) + ":");
            System.out.println("Name: " + exercitii[i].getName() + ", price: " + exercitii[i].getPrice() + ", quantity: " +
                    exercitii[i].getQuantity() + ", category: " + exercitii[i].getCategory());
            if (exercitii[i].hasStock()){
                System.out.println("It's in stock!");
            }else{
                System.out.println("Out of stock!");
            }
            if (exercitii[i].isCategory("Fructe")){
                System.out.println("Same category!");
            }else{
                System.out.println("Different category!");
            }
            System.out.println("\n");
        }

        Bottle sticlaUnu = new Bottle(1, 0.75, false);
        if (sticlaUnu.maxAvailability()){
            System.out.println("The bottle is full!");
        }else{
            System.out.println("The bottle is not full!");
        }
        System.out.println("The available liquid is: " + sticlaUnu.getAvailableLiquid());
        System.out.println("The empty capacity is: " + sticlaUnu.emptyCapacity());
        System.out.println(sticlaUnu.openBottle());
        System.out.println(sticlaUnu.closeBottle());
        System.out.println(sticlaUnu.openBottle());
        System.out.println(sticlaUnu.drink(0.5));
        System.out.println(sticlaUnu.drink(2));
        System.out.println("Your left liquid is: " + sticlaUnu.getAvailableLiquid());
    }
}
