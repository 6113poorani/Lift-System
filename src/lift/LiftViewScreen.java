package lift;

import dto.Lift;

import java.util.List;
import java.util.Scanner;

public class LiftViewScreen {
    LiftViewModel viewModel;
    public LiftViewScreen(){
        this.viewModel=new LiftViewModel(this);
    }

    public void display(List<Lift> lifts) {
        System.out.println("L1 L2 L3 L4 L5");
        for(Lift l:lifts){
            System.out.print(l.getCurrentFloor()+" ");
        }
        System.out.println();
    }

    public void onCreate(List<Lift> lifts) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter starting Position : ");
        int src=scn.nextInt();
        System.out.println("Enter Destination : ");
        int dst=scn.nextInt();
        if(src<0||src>10||dst<0||dst>10){
            System.out.println("Wrong Choice");
            return;
        }
       viewModel.check(lifts,src,dst);
    }

    public void navigateToSuccess(Lift allotedLift) {
        System.out.println("Allotted Lift is "+allotedLift.getLiftId());
    }
}
