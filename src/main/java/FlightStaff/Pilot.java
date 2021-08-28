package FlightStaff;

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

//    public void flyPlane(Plane plane){
//
//    }
}
