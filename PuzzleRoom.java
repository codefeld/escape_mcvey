import java.util.ArrayList;
import java.util.Scanner;

public class PuzzleRoom extends Room {

	// Instance Properties
	private ArrayList<PuzzleOption> options = new ArrayList<>();

	// Abstract Methods
	@Override
	public void displayMessage(Object messageObj) {
		System.out.println(messageObj);
	}

	// Getters and Setters
	public ArrayList<PuzzleOption> getOptions() {
		return this.options;
	}

	public PuzzleOption getPuzzleOption(int i) {
		return this.options.get(i);
	}

	public void addOption(PuzzleOption externalOption) {
		this.options.add(externalOption);
	}

	// Other Methods
	public void printOptions() {
		System.out.println("Here are your options: ");
		for (int i = 0; i < options.size(); i++){
			System.out.println(Integer.toString(i + 1) + ") " + options.get(i).getName());
		}
	}

	// public int selectOption() {
	// 	Scanner optionSelector = new Scanner(System.in);
    // 	//System.out.println("Select the number of the option that fits your destiny: ");
    // 	String userSelection = "";
	// 	while (userSelection != "1" || userSelection != "2") {
	// 		optionSelector.nextLine();
	// 	}
	// 	return Integer.parseInt(userSelection);
	// }

	@Override
	public void runRoom(Player player) {
		// NOTE: These next few lines are temporary. Defining a PuzzleOption should occur in the main GameRun class.
		PuzzleOption tempHappyOption = new PuzzleOption();
		tempHappyOption.setName("Brick Street");
		tempHappyOption.setTaskDesc("Go to Brick Street and party for the rest of the night");
		tempHappyOption.setHappyOrStudy(0);
		addOption(tempHappyOption);

		PuzzleOption tempStudyOption = new PuzzleOption();
		tempStudyOption.setName("Study");
		tempStudyOption.setTaskDesc("Study for your upcoming battle with Professor Boring");
		tempStudyOption.setHappyOrStudy(1);
		addOption(tempStudyOption);

		System.out.println("You have just entered the puzzle room.");
		System.out.println("It looks as though you have two options you can select from.");
		System.out.println("You must choose what to do wisely...");
		printOptions();
		System.out.println("Select the number of the option that fits your destiny: ");
		//int userSelection = selectOption();
		int userSelection = PlayerInput.makeChoice(2);
		PuzzleOption selectedOption = getPuzzleOption(userSelection);
		System.out.println("You have chosen Option " + Integer.toString(userSelection + 1) + ".");
		selectedOption.resolveOption();
		System.out.println("Good job in this room. Let's see if you make the right call...");
	}
}
