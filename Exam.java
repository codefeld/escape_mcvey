import java.util.ArrayList;

// A class conatining information on an exam for players to face in a combat room

// NOTE: May want to have questions added automatically to this class or connect to another class taht does this
public class Exam {
    private int numQuestions;
    private String questionFileName;
    private ArrayList<Question> questions;

    /**
     * Constrcutor that intializes file and blank list of questions
     * @param file The name of teh file to get questions from
     */
    public Exam(String file) {
        setNumQuestions(0);
        setQuestionFileName(file);
        // Create **empty** ArrayList of Questions
        // Add individual questions using addQuestion() method
        setQuestions(new ArrayList<Question>());

    }

    // Methods
    /**
     * Dispalys the question specified
     * @param questNum The number of the question (1-3)
     */
    public void displayQuestion(int questNum) {
        Question q = getQuestion(questNum);
        System.out.println(q.toString());
    }

    /**
     * Check the answer to a specific question on the exam
     * @param questNum The question number (1-3) to check the answer of
     * @param answerNum The proposed answer of the question
     * @return Whether or not the proposed answer is correct
     */
    public boolean answerQuestion(int questNum, int answerNum) {
        return getQuestion(questNum).answerQuestion(answerNum);
    }

    // Getters and Setters

    public int getNumQuestions() {
        return this.numQuestions;
    }

    public void setNumQuestions(int num) {
        this.numQuestions = num;
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    private void setQuestions(ArrayList<Question> q) {
        this.questions = q;
    }

    /**
     * Add a single question 
     * @param q The Question to add
     */
    public void addQuestion(Question q) {
        // If the question is valid and there is still room, add it
        if (q != null && questions.size() < this.numQuestions) {
            this.questions.add(q);
        }
        setNumQuestions(getNumQuestions() + 1);
    }

    /**
     * Get question by the ist INDEX
     * @param questNum The index
     * @return
     */
    public Question getQuestion(int questNum) {
        return questions.get(questNum + 1);
    }

    public void setQuestionFileName(String file) {
        this.questionFileName = file;
    }
    


}