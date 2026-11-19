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
        this.inventory = new Item[ITEM_TYPES];
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
     * @param itemID universal id corresponds to an item type
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

    /**
     * 
     * @param itemID universal id that corresponds to an item type
     * @param subtract amount of given item removed. 0 to check without removing
     * @return true if successful, false if not. 
     */
    public boolean removeItem(int itemID, int subtract) {
        Item target = inventory[itemID];
        if (target == null || target.count < subtract || target.count == 0) {
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


    // vvv not needed atm vvv
    /*
    private class StudyNotes {
        int id;
        String[] notes;
        public StudyNotes() {
            description = ;
            description.add();
        }

        public void clear() {
            
        }
    }
    */

}
