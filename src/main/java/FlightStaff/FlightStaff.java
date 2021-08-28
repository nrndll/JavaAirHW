package FlightStaff;

public abstract class FlightStaff {

    private String name;
    private Rank rank;

    public FlightStaff(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }
}
