public class CombatRoom extends Room{
    private Exam exam;
    private PlayerInput input;

    public CombatRoom(int type, int cr, String n, Exam ex) {
        super(type, cr, n);
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
        System.out.println("You entered " + this.getName() + "!");
        System.out.println("An exam awaits you.");
        
        // Loop until every questions has been answered
        while(questionNum < exam.getNumQuestions()) {
            // Display the question
            System.out.println("It's time for question " + (questionNum + 1) + ".");
            displayMessage(exam.getQuestion(questionNum));

            // Answer the question
            System.out.println("Enter your answer as either \'1\'', \'2\'', or \'3\': ");
            boolean correct = exam.getQuestion(questionNum).answerQuestion(input.makeChoice(3));

            if(correct) {
                System.out.println("That's correct!");
                player.changeGPA(0.5f);  
            } else {
                player.changeGPA(-0.3f);
            }

            // MOve to next question
            questionNum++;
        }

        System.out.println("You completed the exam! Time to leave.");
    }

    

    // Getters and Setters

    public Exam getExam() {
        return this.exam;
    }

    public void setExam(Exam ex) throws Exception {
        if(ex != null) {
            this.exam = ex;
        } else {
            throw new Exception("Exam cannot be null");
        }
        
    }


}
