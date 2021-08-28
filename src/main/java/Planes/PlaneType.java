package Planes;

public enum PlaneType {

    BOEING747(467, 307600),
    DOUGLASDC(145, 15400),
    AIRBUSA340(370, 42500),
    JUNKERSJU52(28, 2725);

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
