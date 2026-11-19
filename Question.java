import java.util.ArrayList;

public class Question {
    // The written question
    private String questionText;
    private int id;
    private int numOptions;

    // The 3 potential answers
    // private String answer1;
    // private String answer2;
    // private String answer3;
    private ArrayList<String> answers;
    

    // the correct answer (1-3)
    private int correctAnswer;

    // Constructors

    /**
     * The constructor that initializes all isntance properties as specified
     * @param quest The question to be asked
     * @param answers The question asnwers
     * @param id The question ID
     * @param correct The correct answer number (starting at 1)
     */
    public Question(String quest, int id, int correct) {
        this.id = id;
        setQuestiontext(quest);
        setCorrectAnswer(correct);
    }

    /**
     * The empty constructor
     */
    public Question(int id) {
        this("", id, 1);
    }

    // Methods
    /**    
     * Gives a foramtted String of the Question in the following format:
     * Question
     * 1. Answer1
     * 2. Answer2
     * 3. Answer3 etc.
     * @return the formatted String
     */
    @Override
    public String toString() {
        String str = this.getQuestionText();
        int num = 1;
        for (String stri : answers) {
            str += String.format("\n%d. %s ", num, stri);
        }
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

    public void addAnswerOption(String quest) {
        this.answers.add(quest);
        this.numOptions++;
    }

    public void removeAnswerOption(String quest) {
        this.answers.remove(quest);
        this.numOptions--;
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }

    // Get by answer number, not index
    public String getAnswerOption(int num) {
        return this.answers.get(num - 1);
    }

    public void setCorrectAnswer(int answer) {
        // Only allow valid answer options 
        if(answer > 0 && answer < this.answers.size()) {
            this.correctAnswer = answer;
        } else {
            // Default
            this.correctAnswer = 1;
        }
        
    }

    public int getNumOptions() {
        return this.numOptions;
    }

    public int getID() {
        return this.id;
    }

}
