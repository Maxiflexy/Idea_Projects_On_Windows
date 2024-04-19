package AwaitingJAVA.Day3.HospitalSystem;

public class MedicalEquipment {
    private String name;
    private String typeOfUsage;
    private String size;

    public MedicalEquipment() {
    }

    public MedicalEquipment(String name,String typeOfUsage,String size) {
        this.name=name;
        this.typeOfUsage=typeOfUsage;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getTypeOfUsage() {
        return typeOfUsage;
    }

    public void setTypeOfUsage(String typeOfUsage) {
        this.typeOfUsage=typeOfUsage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size=size;
    }

    @Override
    public String toString() {
        return  "Name = '" + name + '\'' +
                ", TypeOfUsage = '" + typeOfUsage + '\'' +
                ", Size = " + size;
    }
}
