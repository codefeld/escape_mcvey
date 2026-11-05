import java.util.*;

public class GameRun {
    public static void main(String args[]){
        System.out.println("You're in McVey! Oh look, there are some rooms over there. Let's check them out");
        Base.reset();
        ArrayList<Room> currentFloor = Base.addFloor();
        for(Room r: currentFloor){
            r.runRoom(null);
        }
    }
}
