public class PuzzleOption {

	// Instance Properties
	private String name;
	private String taskDesc;
	private String resolveMessage;
	private double gpaFactor;
	private int happinessFactor;
	//private int optionHappyOrStudy; // happy => 0   study => 1


	// Getters and Setters
	public String getName() {
		return this.name;
	}

	public void setName(String externalName) {
		this.name = externalName;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String externalTaskDesc) {
		this.taskDesc = externalTaskDesc;
	}

	public String getResolveMessage() {
		return this.resolveMessage;
	}

	public void setResolveMessage(String externalResolveMessage) {
		this.resolveMessage = externalResolveMessage;
	}

	// public void setHappyOrStudy(int setting) {
	// 	this.optionHappyOrStudy = setting;
	// }

	public double getGpaFactor() {
		return this.gpaFactor;
	}

	public void setGpaFactor(double externalGpaFactor) {
		this.gpaFactor = externalGpaFactor;
	}

	public int getHappinessFactor() {
		return this.happinessFactor;
	}

	public void setHappinessFactor(int externalHappyFactor) {
		this.happinessFactor = externalHappyFactor;
	}

	// Other Methods

	// NOTE: In the final game, Puzzle Options will be instantiated in the GameRun class. When it is, the Player object will
	// be passed through .setPlayer() so that the GPA and Happiness can be altered and accessed. As of right now, since the Options
	// are temporarily being instantiated inside the PuzzleRoom class's runRoom() method, we do not pass through the Player.
	public void resolveOption(Player player) {
		player.setHappiness(player.getHappiness() + this.happinessFactor);
		player.setGpa(player.getGpa() + this.gpaFactor);
	}
}
