import java.util.Scanner;

public class DaysToWeeks {
    public static String daysToWeeks(int days) {
        int weeks = days / 7; 
        int remainingDays = days % 7;
        String weekForm;
        if (weeks % 10 == 1 && weeks % 100 != 11) {
            weekForm = "неделя";
        } else if (weeks % 10 >= 2 && weeks % 10 <= 4 && (weeks % 100 < 10 || weeks % 100 >= 20)) {
            weekForm = "недели";
        } else {
            weekForm = "недель";
        }
        String dayForm;
        if (remainingDays % 10 == 1 && remainingDays % 100 != 11) {
            dayForm = "день";
        } else if (remainingDays % 10 >= 2 && remainingDays % 10 <= 4 && (remainingDays % 100 < 10 || remainingDays % 100 >= 20)) {
            dayForm = "дня";
        } else {
            dayForm = "дней";
        }
        return weeks + " " + weekForm + " и " + remainingDays + " " + dayForm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int days = scanner.nextInt();
        String result = daysToWeeks(days);
        System.out.println(result);
        scanner.close();
    }
}