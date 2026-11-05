public class Question {
    // The written question
    private String questionText;

    // The 3 potential answers
    private String answer1;
    private String answer2;
    private String answer3;

    // the correct answer (1-3)
    private int correctAnswer;

    // Constructors

    /**
     * The constructor that initializes all isntance properties as specified
     * @param quest The question to be asked
     * @param a1 The first answer option
     * @param a2 The second answer option
     * @param a3 The third answer option
     * @param correct The correct answer number
     */
    public Question(String quest, String a1, String a2, String a3, int correct) {
        setQuestiontext(quest);
        setAnswer1(a1);
        setAnswer2(a2);
        setAnswer3(a3);
        setCorrectAnswer(correct);
    }

    /**
     * The empty constructor
     */
    public Question() {
        this("", "", "", "", 1);
    }

    // Methods
    /**    
     * Gives a foramtted String of the Question in the following format:
     * Question
     * Answer1
     * Answer2
     * Answer3
     * @return the formatted String
     */
    @Override
    public String toString() {
        String str = String.format("%s \n%s \n%s \n%s", this.getQuestionText(), this.getAnswer1(), this.getAnswer2(), this.getAnswer3());
        return str;
    }

    /**
     * Answer the question and check whetehr it is correct
     * @param answerNum The proposed answer to the question
     * @return If the answer was corrrect
     */
    public boolean answerQuestion(int answerNum) {
        return answerNum == this.getCorrectAnswer();
    }

    // Gettters and Setters

    public String getQuestionText() {
        return this.questionText;
    }

    public void setQuestiontext(String s) {
        this.questionText = s;
    }

    public String getAnswer1() {
        return this.answer1;
    }

    public void setAnswer1(String s) {
        this.answer1 = "1. " + s;
    }

    public String getAnswer2() {
        return this.answer2;
    }

    public void setAnswer2(String s) {
        this.answer2 = "2. " + s;
    }

    public String getAnswer3() {
        return this.answer3;
    }

    public void setAnswer3(String s) {
        this.answer3 = "3. " + s;
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(int answer) {
        // Only allow valid answer options (1-3)
        if(answer > 0 && answer < 4) {
            this.correctAnswer = answer;
        } else {
            // Default
            this.correctAnswer = 1;
        }
        
    }

}
