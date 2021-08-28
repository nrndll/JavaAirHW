package Flight;

import FlightStaff.CabinCrewMember;
import FlightStaff.Pilot;
import Passengers.Passenger;
import Planes.Plane;
import Planes.PlaneType;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
//    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, int flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
//        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Plane getPlane(){return plane;}

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

    public int getAvailableSeats(){
        PlaneType planeType = plane.getPlaneType();
        int seatsAvailable = (planeType.getCapacity() - getNumberOfPassengers());
        return seatsAvailable;
    }

    public void bookPassenger(Passenger passenger){
        if(getAvailableSeats() > 0){
            passengers.add(passenger);
        }
    }
}
