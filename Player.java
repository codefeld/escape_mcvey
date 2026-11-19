
import java.util.ArrayList;

public class Player {
    protected double gpa;
    protected int happiness;
    protected Item[] inventory; // ArrayList<Item> inventory;
    protected double creditHours;
    ArrayList<String> studyNotes;
    final int ITEM_TYPES = 4;

    public Player(boolean isHard){
        int ifHard = isHard?2:1;
        this.setCreditHours(0);
        this.setGpa(3.0 / ifHard);
        this.setHappiness(30 / ifHard);
        this.inventory = new Item[ITEM_TYPES];
        this.studyNotes = new ArrayList<>();
    }

    

    // GETTERS AND SETTERS

    public double getGpa(){return this.gpa;}
    public void setGpa(double gpa){
        if(gpa < 0){this.gpa = 0;}
        if (gpa > 4){this.gpa = 4;}
        else{this.gpa = gpa;}
    }

    public int getHappiness(){return this.happiness;}
    public void setHappiness(int happiness){
        this.happiness = happiness;

        if(this.happiness <0){this.happiness = 0;}
    }

    public double getCreditHours(){return this.creditHours;}
    public void setCreditHours(double creditHours){
        this.creditHours = creditHours;
        if(this.creditHours < 0){this.creditHours = 0;}
    }

    public void addNote(String newNote) {
        studyNotes.add(newNote);
    }

    public int countNotes() {
        return studyNotes.size();
    }

    public String getNote(int x) {
        return studyNotes.get(x - 1);
    }

    public void clearNotes() {
        studyNotes.clear();
    }

    /**
     * 
     * @param itemID corresponds to an item type, tbd by the method caller
     * 
     */
    public void addItem(int itemID) {
        Item target = inventory[itemID];
        if (target == null) {
            inventory[itemID] = new Item();
        } else {  
            target.count++;
        }
    }

    public boolean removeItem(int itemID, int subtract) {
        Item target = inventory[itemID];
        if (target == null || target.count < subtract) {
            return false;
        }
        target.count -= subtract;
        return true;
    }

    private class Item {
        int count;
        public Item() {
            count = 1;
        }
    }


    //StudyNotes class unnecessary atm
    /* 
    private class StudyNotes {

        ArrayList<String> notes;
        public StudyNotes() {
            description = new ArrayList<>();
            description.add();
        }

        public void clear() {
            
        }
    }
    */

}
