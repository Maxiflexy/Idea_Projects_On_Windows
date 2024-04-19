package AwaitingJAVA.Day2.ClassWork;

public class Cleaners extends Person{
    private boolean isYoungOrOld;
    public Cleaners() {
    }
    public Cleaners(String name,String stateOfOrigin,String gender,int age,int idNumber) {
        super(name,stateOfOrigin,gender,age,idNumber);
    }
    public boolean isYoungOrOld() {
        return isYoungOrOld;
    }
    public void setYoungOrOld(boolean youngOrOld) {
        isYoungOrOld=youngOrOld;
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "isYoungOrOld=" + isYoungOrOld +
                '}';
    }

}
