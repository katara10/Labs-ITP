import java.util.Scanner;

public class SeasonChecker {
    public static String season(int month) {
        switch (month) {
            case 1: 
            case 2: 
            case 12: 
                return "зима";
            case 3: 
            case 4: 
            case 5: 
                return "весна";
            case 6: 
            case 7: 
            case 8: 
                return "лето";
            case 9: 
            case 10: 
            case 11: 
                return "осень";
            default:
                return "-";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int month = scanner.nextInt();
        String result = season(month);
        System.out.println(result);
        scanner.close();
    }
}
