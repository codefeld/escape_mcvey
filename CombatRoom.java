public class CombatRoom extends Room{
    private Exam exam;

    public CombatRoom(int type, int cr, String n, Exam ex) {
        super(type, cr, n);
    }

    @Override
    public void displayMessage(Object messageObj) {
        // Display the question
        if(messageObj instanceof Question) {
            Question quest = (Question) messageObj;
            System.out.println(quest.toString());
        }
    } 

    

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
