//import Flight.Flight;
//import FlightStaff.CabinCrewMember;
//import FlightStaff.Pilot;
//import FlightStaff.Rank;
//import Planes.Plane;
//import Planes.PlaneType;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class CabinCrewMemberTest {
//
//    private Pilot pilot;
//    private Plane plane;
//    private Flight flight;
//    private CabinCrewMember cabinCrewMember;
//
//    @Before
//    public void before(){
//        cabinCrewMember = new CabinCrewMember("Melchett", Rank.FLIGHTATTENDANT);
//        pilot = new Pilot("Biggles", Rank.CAPTAIN, "777");
//        plane = new Plane(PlaneType.JUNKERSJU52);
//        flight = new Flight(pilot, plane, 123467, "LDN", "GLA", "14:00");
//    }
//
//    @Test
//    public void crewCanMessagePassengers(){
//        String message = String.format("Attention passengers of flight %s, WESA GONNA DIE", flight.getFlightNumber());
//        assertEquals("Attention passengers of flight 123467, WESA GONNA DIE", cabinCrewMember.messagePassengers(message, flight));
//    }
//}
