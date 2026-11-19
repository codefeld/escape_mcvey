
import java.util.ArrayList;

public class Player {
    protected double gpa;
    protected int happiness;
    protected Item[] inventory; // ArrayList<Item> inventory;
    protected double creditHours;
    final int ITEM_TYPES = 4;
    public Player(boolean isHard){
        int ifHard = isHard?2:1;
        this.setCreditHours(0);
        this.setGpa(3.0 / ifHard);
        this.setHappiness(30 / ifHard);
        this.inventory = new Item[ITEM_TYPES];  // ArrayList<>();
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
        ArrayList<String> names;  // unused, open for change
        public Item() {
            count = 1;
        }
    }

}
