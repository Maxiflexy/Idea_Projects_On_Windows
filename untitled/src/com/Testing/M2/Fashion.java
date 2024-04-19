package com.Testing.M2;

public class Fashion extends Goods {
    private String brand;
    private boolean isItMadeOfCotton;
    private int pricePerYard;
    public Fashion () { };

    public Fashion(String nameOfItem,int quantityStored,String name,String brand,boolean isItMadeOfCotton,int pricePerYard) {
        super(nameOfItem,quantityStored,name);
        this.brand=brand;
        this.isItMadeOfCotton=isItMadeOfCotton;
        this.pricePerYard=pricePerYard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isItMadeOfCotton() {
        return isItMadeOfCotton;
    }

    public void setItMadeOfCotton(boolean itMadeOfCotton) {
        isItMadeOfCotton = itMadeOfCotton;
    }

    public int getPricePerYard() {
        return pricePerYard;
    }

    public void setPricePerYard(int pricePerYard) {
        this.pricePerYard = pricePerYard;
    }

    @Override
    public String toString() {
        return "Fashion{" +
                "Brand=' " + brand + '\'' +
                ", isItMadeOfCotton= " + isItMadeOfCotton +
                ", pricePerYard= " + pricePerYard +
                '}';
    }
}
