package com.Testing.M2;
public class Main {
    public static void main(String[] args) {
        Store lekkiStore = new Store();

        Electronics set1 = new Electronics();
        set1.setProductType("Electric Fan");
        set1.setCostPerUnit(8000);
        set1.setHasDefect(false);
        set1.setModelNumber(24536);
        set1.setQuantityStored(25);
        set1.setName("fysfs");
        set1.setNameOfItem("gfssa");

        FoodStuff set2 = new FoodStuff();
        set2.setPricePerKg(1500);
        set2.setItFresh(true);
        set2.setTypeOfStuff("Veggies");

        Fashion set3 = new Fashion();
        set3.setPricePerYard(3000);
        set3.setItMadeOfCotton(true);
        set3.setBrand("Christian Dior");

        Sections orchidSection = new Sections();
        orchidSection.setElectronics1(set1);
        orchidSection.setFashion1(set3);
        orchidSection.setFoodStuff1(set2);
       // System.out.println(orchidSection);
        lekkiStore.setOrchidStore(orchidSection);
        System.out.println(lekkiStore);

    }
}
