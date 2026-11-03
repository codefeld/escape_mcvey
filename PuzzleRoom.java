import java.util.ArrayList;

public class PuzzleRoom extends Room {

	// Instance Properties
	private ArrayList<PuzzleOption> options;

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

	// Other Methods
	public void printOptions() {
		System.out.println("Here are your options: ");
		for (int i = 0; i < options.size(); i++){
			System.out.println(Integer.toString(i) + ") " + options.get(i).getName());
		}
	}
}
