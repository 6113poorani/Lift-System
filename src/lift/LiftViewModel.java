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
        int currdirection=0;

        if(src<dst) currdirection=1;
        if(dst==5||dst==10) currdirection=0;
        if(src>=0&&src<=5){
            if(dst>=0&&dst<=5){
                Lift newLift = lifts.get(0);
                int min = Math.abs(lifts.get(0).getCurrentFloor() - src);
                if (min > Math.abs(lifts.get(1).getCurrentFloor() - src)) {
                    newLift = lifts.get(1);
                }
                if (min == Math.abs(lifts.get(1).getCurrentFloor() - src)&&lifts.get(1).getDirection()==currdirection) {
                    if(lifts.get(0).getDirection()==currdirection){
                        newLift = lifts.get(0);
                    }
                    else
                    newLift = lifts.get(1);
                }
                allotedLift=newLift;
                setLift(dst,newLift,currdirection);

            }
            else if(src==0){
                Lift newLift = lifts.get(2);
                int min = Math.abs(lifts.get(2).getCurrentFloor() - src);
                if (min > Math.abs(lifts.get(3).getCurrentFloor() - src)) {
                    newLift = lifts.get(3);
                }
                if (min == Math.abs(lifts.get(3).getCurrentFloor() - src)&&lifts.get(3).getDirection()==currdirection) {
                    if(lifts.get(2).getDirection()==currdirection){
                        newLift = lifts.get(2);
                    }
                    else
                        newLift = lifts.get(3);
                }
                allotedLift=newLift;
                setLift(dst,newLift,currdirection);
            }
            else{
                allotedLift=lifts.get(4);
                setLift(dst,lifts.get(4),currdirection);
            }
        }
        else{
            if((dst>=6&&dst<=10)||dst==0){
                Lift newLift = lifts.get(2);
                int min = Math.abs(lifts.get(2).getCurrentFloor() - src);
                if (min > Math.abs(lifts.get(3).getCurrentFloor() - src)) {
                    newLift = lifts.get(3);
                }
                if (min == Math.abs(lifts.get(3).getCurrentFloor() - src)&&lifts.get(3).getDirection()==currdirection) {
                    if(lifts.get(2).getDirection()==currdirection){
                        newLift = lifts.get(2);
                    }
                    else
                        newLift = lifts.get(3);
                }
                allotedLift=newLift;
                setLift(dst,newLift,currdirection);
            }
            else{
                allotedLift=lifts.get(4);
                setLift(dst,lifts.get(4),currdirection);
            }
        }
        viewScreen.navigateToSuccess(allotedLift);

    }

    private void setLift(int dst, Lift newLift,int currdirection) {
        newLift.setCurrentFloor(dst);

        newLift.setDirection(currdirection);
    }
}
