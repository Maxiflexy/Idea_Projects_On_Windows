package com.Testing;

public class Borrowers extends Person{
    private boolean isAStudent;
    private int numberOfBooksCollected;
    private boolean isEligible;
    public Borrowers() {
    }
    public Borrowers(String name,String stateOfOrigin,String gender,int age,int idNumber) {
        super(name,stateOfOrigin,gender,age,idNumber);
    }
    public boolean getIsEligible() {
        return isEligible;
    }
    public void setIsEligible(boolean eligible) {
        isEligible=eligible;
    }
    public boolean getIsAStudent() {
        return isAStudent;
    }

    public void setIsAStudent(boolean AStudent) {
        isAStudent=AStudent;
    }

    public int getNumberOfBooksCollected() {
        return numberOfBooksCollected;
    }

    public void setNumberOfBooksCollected(int numberOfBooksCollected) {
        this.numberOfBooksCollected=numberOfBooksCollected;
    }

    @Override
    public String toString() {
        return "Borrowers{" +
                "isAStudent=" + isAStudent +
                ", numberOfBooksCollected=" + numberOfBooksCollected +
                ", isEligible=" + isEligible +
                '}';
    }
}
