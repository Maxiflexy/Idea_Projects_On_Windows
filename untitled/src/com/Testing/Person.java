package com.Testing;
public abstract class Person {
    private String name;
    private String stateOfOrigin;
    private String gender;
    private int age;
    private int idNumber;
    public Person() { }

    public Person(String name,String stateOfOrigin,String gender,int age,int idNumber) {
        this.name=name;
        this.stateOfOrigin=stateOfOrigin;
        this.gender=gender;
        this.age=age;
        this.idNumber=idNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getStateOfOrigin() {
        return stateOfOrigin;
    }
    public void setStateOfOrigin(String nationality) {
        this.stateOfOrigin=nationality;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender=gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        this.idNumber=idNumber;
    }
}
