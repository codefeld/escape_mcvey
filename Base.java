import java.util.*;

public class Base {
    protected static LinkedList<ArrayList<Room>> floorPath;
    protected static Player myPlayer;

    public static void reset(){
        floorPath = new LinkedList<ArrayList<Room>>();
        myPlayer = new Player(false);
    }

    public static ArrayList<Room> addFloor(){
        int[] randomRooms = {random(4), random(3), random(3)};
        ArrayList<Room> floor = new ArrayList<Room>();

        for(int i: randomRooms){
            floor.add(roomChoice(i));
        }

        floorPath.add(floor);

        return floor;

    }



    private static int random(int amount){
        return (int)Math.floor(Math.random() * amount);
    }

    private static Room roomChoice(int i){
        if(i == 0){return new RewardRoom();}
        if(i == 1){return new PuzzleRoom();}
        if(i == 2){return new CombatRoom();}
        if(i == 3){return new StudyRoom();}

        // If all others are false, use combat as defualt
        return new CombatRoom();
    }
}
