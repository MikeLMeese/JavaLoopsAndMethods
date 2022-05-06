import java.util.Scanner;

public class StopAtFive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 5) {
                break;
            }
        }
    }
}