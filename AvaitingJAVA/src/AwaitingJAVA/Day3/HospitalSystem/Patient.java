package AwaitingJAVA.Day3.HospitalSystem;

public class Patient extends Person1{
    private boolean hasAppointment;
    private int cardNumber;
    private double Bill;

    public Patient() {
    }
    public Patient(String name,String gender,String stateOfOrigin,String nationality,char bloodGroup,
                   int idNumber,int age,boolean hasAppointment,int cardNumber,double bill) {
        super(name,gender,stateOfOrigin,nationality,bloodGroup,age);
        this.hasAppointment = hasAppointment;
        this.cardNumber = cardNumber;
        this.Bill = bill;
    }

    public boolean isHasAppointment() {
        return hasAppointment;
    }

    public void setHasAppointment(boolean hasAppointment) {
        this.hasAppointment=hasAppointment;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber=cardNumber;
    }

    public double getBill() {
        return Bill;
    }

    public void setBill(double bill) {
        Bill=bill;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "           HasAppointment = " + hasAppointment +
                ", CardNumber = " + cardNumber +
                ", Bill = " + Bill +
                " }";
    }
}
