public class StudyRoom extends Room{
    boolean vacant;

    public boolean canStudy() {
        return vacant;
    }
    // Idea: stack study-buff, pop over time
    public void pushStudy(int times) {

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
