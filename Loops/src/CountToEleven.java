import java.util.Scanner;

public class CountToEleven {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number less than 11.");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = num; i < 12; i++) {
            System.out.println(i);
        }
    }
}