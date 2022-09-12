import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a string");
        String str = in.nextLine();
        System.out.println("the number of vowel sounds is " + numberOfVowelSounds(str));
        System.out.println("number of consonent sounds is " + numberOfConsonents(str));
        System.out.println("number of digits is " + numberOfDigits(str));
        System.out.println("number of space characters is " + numberOfWhiteCharacters(str));
    }

    public static int numberOfVowelSounds(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }


    public static int numberOfConsonents(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'q' || str.charAt(i) == 'w' || str.charAt(i) == 'r' || str.charAt(i) == 't' || str.charAt(i) == 'y'
                    || str.charAt(i) == 'p' || str.charAt(i) == 's' || str.charAt(i) == 'd' || str.charAt(i) == 'f' || str.charAt(i) == 'g'
                    || str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l' || str.charAt(i) == 'z'
                    || str.charAt(i) == 'x' || str.charAt(i) == 'c' || str.charAt(i) == 'v' || str.charAt(i) == 'b' || str.charAt(i) == 'n'
                    || str.charAt(i) == 'm') {
                count++;
            }
        }
        return count;
    }

    public static int numberOfDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5'
                    || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9' || str.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }

    public static int numberOfWhiteCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
