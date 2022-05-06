import java.util.Scanner;

public class Multiplication {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number:");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}