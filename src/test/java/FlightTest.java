import FlightStaff.Pilot;
import FlightStaff.Rank;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Pilot pilot;
    private Plane plane;
    private Flight flight;

    @Before
    public void before(){
        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
        plane = new Plane(PlaneType.JUNKERSJU52);
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", "14:00");
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(28, flight.getAvailableSeats());
    }
}
