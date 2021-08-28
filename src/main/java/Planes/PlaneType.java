package Planes;

public enum PlaneType {

    JUNKERSJU52(28, 280),
    TERRIBLEPLANE(1, 10);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getTotalWeight(){
        return totalWeight;
    }
}
