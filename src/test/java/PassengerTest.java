import Flight.Flight;
import FlightStaff.CabinCrewMember;
import FlightStaff.Pilot;
import FlightStaff.Rank;
import Passengers.Passenger;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private Date departureTime;

    @Before
    public void before(){
        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
        plane = new Plane(PlaneType.JUNKERSJU52);
        departureTime = new Date();
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", departureTime);
        passenger = new Passenger("Otto", 5);
        flight.bookPassenger(passenger);
    }

    @Test
    public void passengerGetsSetOnFlight(){
        assertEquals(flight, passenger.getFlight());
    }
}
