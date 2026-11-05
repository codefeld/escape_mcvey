import java.util.Scanner;

public class PlayerInput {
    static Scanner sc = new Scanner(System.in);

    public static String askInput(String displayQuestion){
        System.out.println(displayQuestion);
        return sc.nextLine();
    }
}
