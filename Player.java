public class Player {
    
    protected double gpa;
    protected int happiness;
    //protected ArrayList<Item> inventory
    protected double creditHours;

    public Player(boolean isHard){
        int ifHard = isHard?2:1;
        this.setCreditHours(0);
        this.setGpa(3.0 / ifHard);
        this.setHappiness(30 / ifHard);
        
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

    
}
