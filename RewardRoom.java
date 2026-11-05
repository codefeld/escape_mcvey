public class RewardRoom extends Room {
    Object reward;

    public boolean isEmpty() {
        return reward == null;
    }

    public Object removeReward() {
        Object temp = reward;
        reward = null;
        return temp;
    }

    @Override
    public void displayMessage(Object messageObj) {
        System.out.println(messageObj);
    }

    @Override
    public void runRoom(Player player) {
        System.out.println("A reward room");
    }
}
