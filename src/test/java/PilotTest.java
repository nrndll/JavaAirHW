import Flight.Flight;
import FlightStaff.Pilot;
import FlightStaff.Rank;
import Planes.Plane;
import Planes.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    private Date departureTime;

    @Before
    public void before(){
        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
        plane = new Plane(PlaneType.JUNKERSJU52);
        departureTime = new Date();
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", departureTime);
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Flying JUNKERSJU52 from GLA to LDN", pilot.flyPlane(flight));
    }
}
