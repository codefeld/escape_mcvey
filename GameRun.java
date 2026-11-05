import java.util.*;

public class GameRun {
    public static void main(String args[]){
        Base.reset();
        ArrayList<Room> currentFloor = Base.addFloor();
        for(Room r: currentFloor){
            r.runRoom(null);
        }
    }
}
