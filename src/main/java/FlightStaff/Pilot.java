package FlightStaff;

import Flight.Flight;
import Planes.Plane;

public class Pilot extends FlightStaff {

    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber){
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String flyPlane(Flight flight){
        Plane plane = flight.getPlane();
        String output = String.format("Flying %s from %s to %s", plane.getPlaneType(), flight.getDepartureAirport(), flight.getDestination());
        return output;
    }
}
