import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        System.out.println(result);
        scanner.close();
    }
}
