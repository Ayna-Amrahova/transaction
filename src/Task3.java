import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        return str.equals(reversedStr);
    }
}
