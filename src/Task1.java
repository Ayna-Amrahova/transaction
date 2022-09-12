public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkOrangeInString("This is orange juice"));
    }

    public static boolean checkOrangeInString(String str) {
        return str.contains("orange");
    }
}
