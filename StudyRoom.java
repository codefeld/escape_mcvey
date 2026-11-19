public class StudyRoom extends Room{
    boolean vacant;
    int floor;
    Player player;
    
    public StudyRoom(Player player, int floor) {
         this.player = player;
         this.floor = floor;
    }

    public boolean canStudy() {
        if (!vacant) {
            System.out.println("This study room is occupied.");
        } else {
            switch (floor) {
                case 1: System.out.println("The study room is empty.");
                case 2: System.out.println("Oh, someone forgot their notes");
                    System.out.println("... bummer, it's for a different class.");
                case 3: System.out.println("You find sheet of paper hidden under a chair...");
                    System.out.println("Looks like a clean set of notes.");
                    System.out.println("Sweet, its for that one class!");
                    player.addItem(1);
            } 
            System.out.println();
        }
        return vacant;
        
    }
    // Idea: stack study-buff, pop over time
    public void pushStudy(int times) {
        // System.out.println("");
        // System.out.println("Caution: you only have time for 1 study room session per floor");
        
    }

    @Override
    public void displayMessage(Object messageObj) {
        System.out.println(messageObj);
    }

    @Override
    public void runRoom(Player player) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runRoom'");
    }

}
