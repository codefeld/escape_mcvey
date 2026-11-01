public abstract class Room {
    // Instance Properties
    // 0: Puzzle, 1: Combat, 2: Boss, 3: Reward
    private int roomType;
    private final int creditHours;
    private String name;

    // Constructors
    
    /**
     * Constrctor that specifies all isntance properties to be set
     * 
     * @param type The type of room this will be (0: Puzzle, 1: Combat, 2: Boss, 3:
     *             Reward)
     * @param cr   The number of credithours
     * @param n    The name of the room
     */
    public Room(int type, int cr, String n) {
        setRoomType(type);
        // Set intial
        if (cr >= 0) {
            this.creditHours = cr;
        } else {
            this.creditHours = 0;
        }
        setName(n);
    }

    /**
     * Partial constrctor that intializes type to specified value
     * 
     * @param type The type of room this will be (0: Puzzle, 1: Combat, 2: Boss, 3:
     *             Reward)
     */
    public Room(int type) {
        this(type, 0, "room");
    }

    /**
     * Empty constructor that intializes all properties to default values
     */
    public Room() {
        this(1, 0, "room");
    }

    // Abstract Methods

    /**
     * Print out a message about the room
     * 
     * @param message The message to be printed
     */
    public abstract void displayMessage(Object messageObj);

    // Getters and setters

    /**
     * Get the type of room
     * 
     * @return The roomType
     */
    public int getRoomType() {
        return this.roomType;
    }

    /**
     * Set the type of room
     * 
     * @param type The type to set (0: Puzzle, 1: Combat, 2: Boss, 3: Reward)
     */
    private void setRoomType(int type) {
        if (type > +0 && type <= 3) {
            this.roomType = type;
        }
    }

    /**
     * Get the number of credit hours rewarded by this room
     * 
     * @return the number of credit hours rewarded by this room
     */
    public int getCreditHours() {
        return this.creditHours;
    }

    /**
     * Get the room's name
     * 
     * @return the room's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the rooms's name
     * 
     * @param n the new name
     */
    private void setName(String n) {
        this.name = n;
    }

}
