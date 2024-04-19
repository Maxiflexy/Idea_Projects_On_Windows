package AwaitingJAVA.Day1;
public class Animal {

    private String name;
    private int numberOfEyes;
    private int numberOfLegs;
    private boolean canFly;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes=numberOfEyes;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs=numberOfLegs;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly=canFly;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfLegs=" + numberOfLegs +
                ", canFly=" + canFly +
                ", age=" + age +
                '}';
    }

}
