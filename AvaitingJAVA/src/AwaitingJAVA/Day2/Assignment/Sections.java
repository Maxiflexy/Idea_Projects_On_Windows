package AwaitingJAVA.Day2.Assignment;

public class Sections {
    private Electronics electronics1;
    private FoodStuff foodStuff1;
    private Fashion fashion1;

    public Electronics getElectronics1() {
        return electronics1;
    }
    public void setElectronics1(Electronics electronics1) {
        this.electronics1=electronics1;
    }

    public FoodStuff getFoodStuff1() {
        return foodStuff1;
    }

    public void setFoodStuff1(FoodStuff foodStuff1) {
        this.foodStuff1=foodStuff1;
    }

    public Fashion getFashion1() {
        return fashion1;
    }

    public void setFashion1(Fashion fashion1) {
        this.fashion1=fashion1;
    }
    @Override
    public String toString() {
        return "Orchid Store" + "\n" +
                " Electronics:  " + electronics1 + "\n" +
                " FoodStuff: " + foodStuff1 + "\n" +
                " Fashion: " + fashion1 +
                '}';

    }
}
