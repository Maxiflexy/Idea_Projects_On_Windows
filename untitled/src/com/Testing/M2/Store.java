package com.Testing.M2;

public class Store {
    private Sections orchidStore;
    public Store(){}
    public Sections getOrchidStore() {
        return orchidStore;
    }

    public void setOrchidStore(Sections orchidStore) {
        this.orchidStore=orchidStore;
    }

    @Override
    public String toString() {
        return "Store{" +
                "SectionsA = " + orchidStore +
                '}';
    }
}
