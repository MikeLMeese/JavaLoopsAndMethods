import java.util.Scanner;

public class TakeABreak {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Do you want to take a break?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}