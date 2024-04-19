package com.Testing.M2;

public class FoodStuff extends Goods{
    private String typeOfStuff;
    private boolean isItFresh;
    private int pricePerKg;

    public FoodStuff() { }
    public FoodStuff(String nameOfItem,int quantityStored,String name,String typeOfStuff,boolean isItFresh,int pricePerKg) {
        super(nameOfItem,quantityStored,name);
        this.typeOfStuff=typeOfStuff;
        this.isItFresh=isItFresh;
        this.pricePerKg=pricePerKg;
    }

    public String getTypeOfStuff() {
        return typeOfStuff;
    }

    public void setTypeOfStuff(String typeOfStuff) {
        this.typeOfStuff=typeOfStuff;
    }

    public boolean isItFresh() {
        return isItFresh;
    }

    public void setItFresh(boolean itFresh) {
        isItFresh=itFresh;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg=pricePerKg;
    }

    @Override
    public String toString() {
        return "FoodStuff{" +
                "TypeOfStuff= '" + typeOfStuff + '\'' +
                ", IsItFresh = " + isItFresh +
                ", PricePerKg = " + pricePerKg +
                '}';
    }
}
