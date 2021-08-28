import FlightStaff.Pilot;
import Passengers.Passenger;
import Planes.Plane;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<Passenger> passengers;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, int flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
