package CalcEngine;

public class Flight {
    private int flightNumber;
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }
    Flight val1 = new Flight(10);
    Flight val2 = new Flight(20);

    static void swapFlight(Flight x, Flight y){
        Flight z = x;
        x = y ;
        y = z;
    }
}
