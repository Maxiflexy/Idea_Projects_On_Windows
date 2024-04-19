package AwaitingJAVA.Day2.ClassWork;

public class Liberians extends Person{
    private double workExperience;
    private String educationQualification;
    private String department;

    public Liberians() {
    }
    public Liberians(String name,String stateOfOrigin,String gender,int age,int idNumber) {
        super(name,stateOfOrigin,gender,age,idNumber);
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department=department;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience=workExperience;
    }

    public String getEducationQualification() {
        return educationQualification;
    }
    public void setEducationQualification(String educationQualification) {
        this.educationQualification=educationQualification;
    }
    @Override
    public String toString() {
        return "Liberians{" +
                "workExperience=" + workExperience +
                ", educationQualification='" + educationQualification + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
