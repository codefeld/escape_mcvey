public class CombatRoom extends Room{
    private Exam exam;

    public CombatRoom(int type, int cr, String n, Exam ex) {
        super(type, cr, n);
        setExam(ex);
    }

    public CombatRoom() {
        Question q = new Question("How old am I?", "12", "54", "20", 3);
        Question q2 = new Question("What year is it?", "1776", "2026", "1812", 2);
        Question q3 = new Question("Who is the professor?", "Kaylynn Borror", "Kaylynn Boring", "Katelynn Border", 1);
        Exam e = new Exam("file");
        e.addQuestion(q);
        e.addQuestion(q2);
        e.addQuestion(q3);
        this(1, 0, "Mysterious Room", e);

    }

    // Methods

    /**    
     * Displays a question Object
     * @Object the Question to be displayed
     */
    @Override
    public void displayMessage(Object messageObj) {
        // Display the question
        if(messageObj instanceof Question) {
            Question quest = (Question) messageObj;
            System.out.println(quest.toString());
        }
    } 

    /**    
     * Runs the combat room, having players take an exam
     * @param player The Player entering the room
     */
    @Override
    public void runRoom(Player player) {
        // Question # that player is on
        int questionNum = 0;

        // Intro messages
        System.out.println("\nYou entered " + this.getName() + "!");
        System.out.println("An exam awaits you.\n");
        
        // Loop until every questions has been answered
        while(questionNum < exam.getNumQuestions()) {
            // Display the question
            System.out.println("It's time for question " + (questionNum + 1) + ".");
            displayMessage(exam.getQuestion(questionNum));

            // Answer the question
            System.out.println("Enter your answer as either \'1\', \'2\', or \'3\': ");
            // Double check if use PlayerINput.makeChoice() or object like I did here
            boolean correct = exam.getQuestion(questionNum).answerQuestion(PlayerInput.makeChoice(3));

            if(correct) {
                System.out.println("That's correct, smarty pants!\n");
                //player.setGPA(player.getGPA() + 0.25f);  
            } else {
                System.out.println("That's wrong, dumb, dumb!\n");
                //player.changeGPA(player.getGPA() - 0.25f);
            }

            // Move to next question
            questionNum++;
        }

        System.out.println("You completed the exam! Time to leave.");
    }

    

    // Getters and Setters

    public Exam getExam() {
        return this.exam;
    }

    public void setExam(Exam ex) {
        if(ex != null) {
            this.exam = ex;
        } else {
            System.out.println("Exam cannot be null");
        }
        
    }


}
