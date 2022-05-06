public class AverageMethod {

    public static void main(String[] args) throws Exception {
        int num1 = 15;
        int num2 = 22;
        int num3 = 406;
        System.out.println("The average is: " + average(num1, num2, num3));

    }
    public static int sum(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        return total;
    }
    public static double average(int num1, int num2, int num3) {
        double averageValue = sum(num1, num2, num3) / 3.0;
        return averageValue;
    }
}