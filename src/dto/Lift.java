package dto;

public class Lift {
    static int id=1;
    int LiftId;
    int currentFloor;
    int startFloor;
    int dstFloor;

    public Lift( int currentFloor, int startFloor, int dstFloor) {
       this. LiftId = id;
        id++;
        this.currentFloor = currentFloor;
        this.startFloor = startFloor;
        this.dstFloor = dstFloor;
    }

    public int getLiftId() {
        return LiftId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }


}
