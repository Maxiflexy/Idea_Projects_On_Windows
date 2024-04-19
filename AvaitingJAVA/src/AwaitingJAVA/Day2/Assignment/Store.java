package AwaitingJAVA.Day2.Assignment;

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
                "Orchid Store" + "\n" +
                " Electronics:  " + getOrchidStore().getElectronics1() + "\n" +
                " FoodStuff: " + getOrchidStore().getFoodStuff1() + "\n" +
                " Fashion: " + getOrchidStore().getFashion1() +
                '}';
    }
}
