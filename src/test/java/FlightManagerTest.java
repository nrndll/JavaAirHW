import Flight.Flight;
import FlightStaff.Pilot;
import FlightStaff.Rank;
import Passengers.Passenger;
import Planes.Plane;
import Planes.PlaneType;
import Flight.FlightManager;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private Date departureTime;

    @Before
    public void before(){
        flightManager = new FlightManager();
        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
        plane = new Plane(PlaneType.JUNKERSJU52);
        departureTime = new Date();
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", departureTime);
        passenger = new Passenger("Otto", 5);
    }

    @Test
    public void getBaggageWeightPerPassenger(){
        assertEquals(10, flightManager.getBaggagePerPassenger(flight), 0.01);
    }

    @Test
    public void canCalculateBaggageBooked(){
        flight.bookPassenger(passenger);
        assertEquals(5, flightManager.getBaggageBooked(flight));
    }

    @Test
    public void canCalculateBaggageRemaining(){
        flight.bookPassenger(passenger);
        assertEquals(275, flightManager.getBaggageRemaining(flight), 0.01);
    }
}
