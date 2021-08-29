package FlightStaff;

public class CabinCrewMember extends FlightStaff {

    public CabinCrewMember(String name, Rank rank){
        super(name, rank);
    }

    public String messagePassengers(String message){
        return message;
    }
}
