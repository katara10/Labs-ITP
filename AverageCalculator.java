import java.util.Scanner;

public class AverageCalculator {
    public static double average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int num1 = scanner.nextInt();
        System.out.print("");
        int num2 = scanner.nextInt();
        System.out.print("");
        int num3 = scanner.nextInt();
        double result = average(num1, num2, num3);
        System.out.printf("%.2f%n", result);
        scanner.close();
    }
}
