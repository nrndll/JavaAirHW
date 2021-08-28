import Flight.Flight;
import FlightStaff.Pilot;
import FlightStaff.Rank;
import Passengers.Passenger;
import Planes.Plane;
import Planes.PlaneType;
import Flight.FlightManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        flightManager = new FlightManager();
        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
        plane = new Plane(PlaneType.JUNKERSJU52);
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", "14:00");
        passenger1 = new Passenger("Otto", 5);
        passenger2 = new Passenger("Sump", 6);
    }

    @Test
    public void getBaggageWeightPerPassenger(){
        assertEquals(10, flightManager.getBaggagePerPassenger(flight), 0.01);
    }

    @Test
    public void canCalculateBaggageBooked(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(11, flightManager.getBaggageBooked(flight));
    }
}
