package com.Testing;

public class Library {

    private Department departmentA;
    public Library() {
    }
    public Department getDepartmentA() {
        return departmentA;
    }
    public void setDepartmentA(Department departmentA) {
        this.departmentA=departmentA;
    }

    @Override
    public String toString() {
        return "Library{" +
                "departmentA=" + departmentA +
                '}';
    }
}
