import java.util.Scanner;

public class Even {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int number = scanner.nextInt();
        boolean result = isEven(number);
        System.out.println(result);
        scanner.close();
    }
}
