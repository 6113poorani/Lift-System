import dto.Lift;
import lift.LiftViewScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    List<Lift> lifts=new ArrayList<>();
    lifts.add(new Lift(0,0,5));
    lifts.add(new Lift(0,0,5));
    lifts.add(new Lift(0,6,8));
    lifts.add(new Lift(0,6,8));
    lifts.add(new Lift(0,0,10));
    boolean flag=true;
    LiftViewScreen liftViewScreen=new LiftViewScreen();
    while(flag){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your choice : ");
        System.out.println("1.Add User \n2.Display Lift Details " );
        int choice=scn.nextInt();
        switch(choice){
            case 1:
            {
                liftViewScreen.onCreate(lifts);

            }
            case 2:{
                    liftViewScreen.display(lifts);
            }
        }
    }
    }
}