public class PuzzleOption {

	// Instance Properties
	private String name;
	private String happyTaskDesc;
	private String studyTaskDesc;
	private int optionHappyOrStudy; // happy => 0   study => 1


	// Getters and Setters
	public String getName() {
		return this.name;
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
			// TODO: get Player happiness and increase
			System.out.println("Increased player's Happiness.");
			// TODO: get Player GPA and decrease
			System.out.println("Decreased player's GPA.");
		}
		else if (this.optionHappyOrStudy == 1) {
			// TODO: get Player GPA and increase
			System.out.println("Increased player's GPA.");
			// TODO: get Player happiness and decrease
			System.out.println("Decreased player's Happiness.");
		}
	}
}
