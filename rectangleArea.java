import java.util.Scanner;

public class rectangleArea {
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("len: ");
        double length = scanner.nextDouble();
        System.out.print("wid: ");
        double width = scanner.nextDouble();
        double area = calculateArea(length, width);
        System.out.printf("S: %.2f%n", area);
        scanner.close();
    }
}