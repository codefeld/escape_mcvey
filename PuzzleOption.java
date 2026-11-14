public class PuzzleOption {

	// Instance Properties
	private String name;
	private String happyTaskDesc;
	private String studyTaskDesc;
	private int optionHappyOrStudy; // happy => 0   study => 1
	private Player player;


	// Getters and Setters
	public String getName() {
		return this.name;
	}

	public void setPlayer(Player externalPlayer) {
		this.player = externalPlayer;
	}

	public String getHappyTaskDesc() {
		return this.happyTaskDesc;
	}

	public String getStudyTaskDesc() {
		return this.studyTaskDesc;
	}

	public void setHappyOrStudy(int setting) {
		this.optionHappyOrStudy = setting;
	}

	// Other Methods
	public void resolveOption() {
		if (this.optionHappyOrStudy == 0) {
			player.setHappiness(player.getHappiness() + 1);
			player.setGpa(player.getGpa() - 0.5);
		}
		else if (this.optionHappyOrStudy == 1) {
			player.setHappiness(player.getHappiness() - 1);
			player.setGpa(player.getGpa() + 0.5);
		}
	}
}
