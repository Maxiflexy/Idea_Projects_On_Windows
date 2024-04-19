package AwaitingJAVA.Day3.HospitalSystem;

public  abstract class Person1 {
    private String name;
    private String gender;
    private String stateOfOrigin;
    private String nationality;
    private char bloodGroup;
    private int age;

    public Person1() { }

    public Person1(String name,String gender,String stateOfOrigin,String nationality,
                   char bloodGroup,int age) {
        this.name=name;
        this.gender=gender;
        this.stateOfOrigin=stateOfOrigin;
        this.nationality=nationality;
        this.bloodGroup=bloodGroup;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin=stateOfOrigin;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality=nationality;
    }

    public char getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(char bloodGroup) {
        this.bloodGroup=bloodGroup;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
    @Override
    public String toString() {
        return  "Name = '" + name + '\'' +
                ", Gender = '" + gender + '\'' +
                ", StateOfOrigin = '" + stateOfOrigin + '\'' +
                ", Nationality = '" + nationality + '\'' +
                ", BloodGroup = " + bloodGroup +
                ", Age = " + age;
    }
}
