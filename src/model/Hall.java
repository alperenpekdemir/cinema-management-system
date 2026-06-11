package model;

public class Hall {
    private int hallId;
    private String hallName;
    private int capacity;
    private String hallType; // 2D, 3D, IMAX

    public Hall() {}

    public Hall(int hallId, String hallName, int capacity, String hallType) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.capacity = capacity;
        this.hallType = hallType;
    }

    public int getHallId()       { return hallId; }
    public String getHallName()  { return hallName; }
    public int getCapacity()     { return capacity; }
    public String getHallType()  { return hallType; }

    public void setHallId(int hallId)          { this.hallId = hallId; }
    public void setHallName(String hallName)   { this.hallName = hallName; }
    public void setCapacity(int capacity)      { this.capacity = capacity; }
    public void setHallType(String hallType)   { this.hallType = hallType; }

    @Override
    public String toString() { return hallId + " - " + hallName + " (" + hallType + ")"; }
}
