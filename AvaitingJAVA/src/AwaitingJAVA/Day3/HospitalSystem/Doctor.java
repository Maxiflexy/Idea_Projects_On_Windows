package AwaitingJAVA.Day3.HospitalSystem;

public class Doctor extends Person1 {
    private String specialty;
    private String qualification;
    private int yearOfExperience;
    boolean isCurrentlyAvailable;

    public Doctor() {
    }
    public Doctor(String name,String gender,String stateOfOrigin,String nationality,char bloodGroup,
                  int idNumber,int age,String specialty,String qualification,
                  int yearOfExperience,boolean isCurrentlyAvailable) {
        super(name,gender,stateOfOrigin,nationality,bloodGroup,age);
        this.specialty=specialty;
        this.qualification=qualification;
        this.yearOfExperience=yearOfExperience;
        this.isCurrentlyAvailable=isCurrentlyAvailable;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty=specialty;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification=qualification;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience=yearOfExperience;
    }

    public boolean isCurrentlyAvailable() {
        return isCurrentlyAvailable;
    }

    public void setCurrentlyAvailable(boolean currentlyAvailable) {
        isCurrentlyAvailable=currentlyAvailable;
    }

    @Override
    public String toString() {
        return  super.toString() + '\n' +
                "          Specialty = '" + specialty + '\'' +
                ", Qualification = '" + qualification + '\'' +
                ", YearsOfExperience = " + yearOfExperience +
                ", IsCurrentlyAvailable = " + isCurrentlyAvailable +
                " }";
    }
}
