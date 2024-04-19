package AwaitingJAVA.Day3.HospitalSystem;
public class Nurse extends Person1 {
    private String qualification;
    private String currentPosition;
    private int yearsOfExperience;
    public Nurse() {}
    public Nurse(String name,String gender,String stateOfOrigin,String nationality,char bloodGroup,int idNumber,
                 int age,String qualification,String currentPosition,int yearsOfExperience) {
        super(name,gender,stateOfOrigin,nationality,bloodGroup,age);
        this.qualification=qualification;
        this.currentPosition=currentPosition;
        this.yearsOfExperience=yearsOfExperience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification=qualification;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition=currentPosition;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience=yearsOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "         Qualification = '" + qualification + '\'' +
                ", CurrentPosition = '" + currentPosition + '\'' +
                ", YearsOfExperience = " + yearsOfExperience +
                " }";
    }
}
