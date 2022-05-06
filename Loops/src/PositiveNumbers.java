import java.util.Scanner;

public class PositiveNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Enter a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num < 0) {
                System.out.println("No negative numbers allowed!");
                continue;
            }
        }
    }
}