package lift;

import dto.Lift;

import java.util.List;

public class LiftViewModel {
    LiftViewScreen viewScreen;
    LiftViewModel(LiftViewScreen viewScreen){
        this.viewScreen=viewScreen;
    }

    public void check(List<Lift> lifts, int src, int dst) {
        Lift allotedLift=null;
        if(src>=0&&src<=5){
            if(dst>=0&&dst<=5){
                Lift newLift = lifts.get(0);
                int min = Math.abs(lifts.get(0).getCurrentFloor() - src);
                if (min > Math.abs(lifts.get(1).getCurrentFloor() - src)) {
                    newLift = lifts.get(1);
                }
                allotedLift=newLift;
                setLift(dst,newLift);

            }
            else if(src==0){
                Lift newLift = lifts.get(2);
                int min = Math.abs(lifts.get(2).getCurrentFloor() - src);
                if (min > Math.abs(lifts.get(3).getCurrentFloor() - src)) {
                    newLift = lifts.get(3);
                }
                allotedLift=newLift;
                setLift(dst,newLift);
            }
            else{
                allotedLift=lifts.get(4);
                setLift(dst,lifts.get(4));
            }
        }
        else{
            if((dst>=6&&dst<=10)||dst==0){
                Lift newLift = lifts.get(2);
                int min = Math.abs(lifts.get(2).getCurrentFloor() - src);
                if (min > Math.abs(lifts.get(3).getCurrentFloor() - src)) {
                    newLift = lifts.get(3);
                }
                allotedLift=newLift;
                setLift(dst,newLift);
            }
            else{
                allotedLift=lifts.get(4);
                setLift(dst,lifts.get(4));
            }
        }
        viewScreen.navigateToSuccess(allotedLift);

    }

    private void setLift(int dst, Lift newLift) {
        newLift.setCurrentFloor(dst);
    }
}
