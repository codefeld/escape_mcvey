public class PuzzleOption {

	// Instance Properties
	private String name;
	// private String happyTaskDesc;
	// private String studyTaskDesc;
	private String taskDesc;
	private int optionHappyOrStudy; // happy => 0   study => 1
	private Player player;


	// Getters and Setters
	public String getName() {
		return this.name;
	}

	public void setName(String externalName) {
		this.name = externalName;
	}

	public void setPlayer(Player externalPlayer){
		this.player = externalPlayer;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String externalTaskDesc) {
		this.taskDesc = externalTaskDesc;
	}

	public void setHappyOrStudy(int setting) {
		this.optionHappyOrStudy = setting;
	}

	// Other Methods

	// NOTE: In the final game, Puzzle Options will be instantiated in the GameRun class. When it is, the Player object will
	// be passed through .setPlayer() so that the GPA and Happiness can be altered and accessed. As of right now, since the Options
	// are temporarily being instantiated inside the PuzzleRoom class's runRoom() method, we do not pass through the Player.
	public void resolveOption() {
		if (this.optionHappyOrStudy == 0) {
			// player.setHappiness(player.getHappiness() + 1);
			// player.setGpa(player.getGpa() - 0.5);
			System.out.print("TODO: resolve the option");
		}
		else if (this.optionHappyOrStudy == 1) {
			// player.setHappiness(player.getHappiness() - 1);
			// player.setGpa(player.getGpa() + 0.5);
			System.out.print("TODO: resolve the option");
		}
	}
}
