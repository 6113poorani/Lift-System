package dto;

public class Lift {
    static int id=1;
    int LiftId;
    int currentFloor;
    int startFloor;
    int dstFloor;
    int direction;

    public Lift( int currentFloor, int startFloor, int dstFloor) {
       this. LiftId = id;
        id++;
        this.currentFloor = currentFloor;
        this.startFloor = startFloor;
        this.dstFloor = dstFloor;
        this.direction=1;

    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
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
