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

public class FlightTest {

    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private CabinCrewMember cabinCrewMember1;
    private Date departureTime;

    @Before
    public void before(){
        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
        plane = new Plane(PlaneType.JUNKERSJU52);
        departureTime = new Date();
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", departureTime);
        passenger1 = new Passenger("Otto", 5);
        passenger2 = new Passenger("Sump", 6);
        cabinCrewMember1 = new CabinCrewMember("Melchett", Rank.FIRSTOFFICER);
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(28, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void cannotBookPassengerIfAtCapacity(){
        plane = new Plane(PlaneType.TERRIBLEPLANE);
        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", departureTime);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void canAddCrewMember(){
        flight.addCrew(cabinCrewMember1);
        assertEquals(1, flight.getNumberOfCabinCrew());
    }

}
