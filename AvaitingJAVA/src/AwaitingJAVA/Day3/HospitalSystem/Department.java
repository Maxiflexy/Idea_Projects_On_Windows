package AwaitingJAVA.Day3.HospitalSystem;
public class Department {
    private Optometry optometry;
    private Dentistry dentistry;
    private Orthopedics orthopedics;

    public Optometry getOptometry() {
        return optometry;
    }

    public void setOptometry(Optometry optometry) {
        this.optometry=optometry;
    }

    public Dentistry getDentistry() {
        return dentistry;
    }

    public void setDentistry(Dentistry dentistry) {
        this.dentistry=dentistry;
    }

    public Orthopedics getOrthopedics() {
        return orthopedics;
    }

    public void setOrthopedics(Orthopedics orthopedics) {
        this.orthopedics=orthopedics;
    }

    @Override
    public String toString() {
        return " OPTOMETRY DEPARTMENT: " + '\n' + optometry + '\n' +
                " " + '\n' +
                " DENTISTRY DEPARTMENT: "+ '\n' + dentistry + '\n' +
                " " + '\n' +
                " ORTHOPEDICS DEPARTMENT: " +'\n' + orthopedics;
    }
}
