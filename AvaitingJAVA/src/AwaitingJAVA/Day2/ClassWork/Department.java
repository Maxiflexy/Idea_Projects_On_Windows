package AwaitingJAVA.Day2.ClassWork;

public class Department {

    private Liberians liberiansA;
    private Borrowers borrowersA;
    private Cleaners cleanersA;

    public Liberians getLiberiansA() {
        return liberiansA;
    }

    public void setLiberiansA(Liberians liberiansA) {
        this.liberiansA=liberiansA;
    }

    public Borrowers getBorrowersA() {
        return borrowersA;
    }

    public void setBorrowersA(Borrowers borrowersA) {
        this.borrowersA=borrowersA;
    }

    public Cleaners getCleanersA() {
        return cleanersA;
    }

    public void setCleanersA(Cleaners cleanersA) {
        this.cleanersA=cleanersA;
    }

    @Override
    public String toString() {
        return "Department{" +
                "liberiansA=" + liberiansA +
                ", borrowersA=" + borrowersA +
                ", cleanersA=" + cleanersA +
                '}';
    }
}
