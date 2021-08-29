package Flight;

import Passengers.Passenger;
import Planes.Plane;
import Planes.PlaneType;

import java.util.ArrayList;

public class FlightManager {

    public FlightManager(){}

    public double getBaggagePerPassenger(Flight flight){
        Plane plane = flight.getPlane();
        PlaneType planeType = plane.getPlaneType();
        double totalWeight = planeType.getTotalWeight();
        int capacity = planeType.getCapacity();
        return totalWeight / capacity;
    }

    public int getBaggageBooked(Flight flight){
        int totalBaggage = 0;
        ArrayList<Passenger> passengers = flight.getPassengers();
        for(Passenger i : passengers) {
            totalBaggage += i.getNumberOfBags();
        }
        return totalBaggage;
    }

    public double getBaggageRemaining(Flight flight){
        Plane plane = flight.getPlane();
        PlaneType planeType = plane.getPlaneType();
        double totalWeight = planeType.getTotalWeight();
        return totalWeight - getBaggageBooked(flight);
    }
}
