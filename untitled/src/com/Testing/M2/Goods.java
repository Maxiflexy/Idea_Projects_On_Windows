package com.Testing.M2;

public abstract class Goods {
    private String typeOfProduct;
    private String name;
    private int quantityStored;
    public Goods(){ }

    public Goods(String nameOfItem,int quantityStored,String name) {
        this.typeOfProduct=nameOfItem;
        this.quantityStored=quantityStored;
        this.name = name;

    }

    public String getNameOfItem() {
        return typeOfProduct;
    }

    public void setNameOfItem(String nameOfItem) {
        this.typeOfProduct=nameOfItem;
    }
    public int getQuantityStored() {
        return quantityStored;
    }

    public void setQuantityStored(int quantityStored) {
        this.quantityStored=quantityStored;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "typeOfProduct='" + typeOfProduct + '\'' +
                ", name='" + name + '\'' +
                ", quantityStored=" + quantityStored +
                '}';
    }
}
