public class BossRoom extends CombatRoom {
    private String bossName;
    private String[] quips;

    public BossRoom(int type, int cr, String n, Exam ex, String boss) {
        super(type, cr, n, ex);
        String[] arr = {"Ha! You'll never get this question.", 
            "To tree or not to tree, that is the binary question.", 
            "I'll get you my little preety, and you're little quiz too!",
            "Boo, you suck!",
            "This next one 'll knock ya socks off.",
            "Ay, I'm walkin' here!",
            "Wow, these developers are really running out of ideas, huh!",
            "Yep, they're just doing 4th wall breaks now.",
            "Honestly, it's better than whatever those \"jokes\" were supposed to be."};
        this.quips = arr;
        
    }

    /**    
     * Runs the boss room, having players take an exam and fight a professor
     * @param player The Player entering the room
     */
    @Override
    public void runRoom(Player player) {
        // Question # that player is on
        int questionNum = 0;
        int quipNum = 0;

        // Intro messages
        System.out.println("\nYou entered " + this.getName() + "!");
        System.out.println("Professor " + this.getBossName() + " awaits you. Learn or be expelled!");
        
        
        // Loop until every questions has been answered
        while(questionNum < this.getExam().getNumQuestions()) {
            // Display quip from Professor
            System.out.println("Professor " + this.getBossName() + ": " + quips[quipNum]);

            // Display the question
            System.out.println("It's time for question " + (questionNum + 1) + ".");
            displayMessage(this.getExam().getQuestion(questionNum));

            // Answer the question
            System.out.println("Enter your answer as either \'1\', \'2\', or \'3\': ");
            // Double check if use PlayerINput.makeChoice() or object like I did here
            boolean correct = this.getExam().getQuestion(questionNum).answerQuestion(PlayerInput.makeChoice(3));

            if(correct) {
                System.out.println("That's correct, my most wondrous pupil!\n");
                //player.setGPA(player.getGPA() + 0.25f);  
            } else {
                System.out.println("That's wrong, you failure of a student!\n");
                //player.changeGPA(player.getGPA() - 0.25f);
            }

            // Move to next question
            questionNum++;
            quipNum++;
            if(quipNum >= quips.length) {
                quipNum = 0;
            }
        }

        System.out.println("You completed the exam! Professor " + this.getBossName() + " has been defeated!");
        System.out.println("You gained " + this.getCreditHours()  + " credit hours!");
        //player.setCreditHours(player.getCreditHours() + this.getCreditHours);
    }

    // Getters and Setters
    public String getBossName() {
        return this.bossName;
    }

    public void setBossName(String name) {
        this.bossName = name;
    }
}
