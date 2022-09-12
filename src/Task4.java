public class Task4 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        getIndexOfAlphabet(str);
        System.out.println();
        System.out.println("original string: " + str);
        System.out.println();
        System.out.println("replaced string: " + replaceString(str));
        System.out.println();
        System.out.println("Starts with: " + checkStartsWith(str, "test"));
        System.out.println();
        System.out.println("Substring: " + substring(str, 2, 5));
        System.out.println();


        //29
        System.out.println("To lowerCase: " + str.toLowerCase());
        System.out.println();
        //30
        System.out.println("To upperCase: " + str.toUpperCase());
        System.out.println();
        //38
        System.out.println("Remove duplicates: " + removeDuplicateChars("Sabina"));
        System.out.println();
        //44
        reversedString(str);
        System.out.println();
        //91
        System.out.println("Count of end with m or n: " + endWithmOrn(str));

        System.out.println("test".indexOf('g'));
    }


    public static boolean checkWordInString(String str, String word) {
        String[] wordsArray = str.split(" ");
        boolean orange = false;
        for (String word1 : wordsArray) {
            orange = word1.equals(word);

        }
        return orange;
    }

    //19
    public static void getIndexOfAlphabet(String str) {
        int a = str.indexOf("a");
        int b = str.indexOf("b");
        int c = str.indexOf("c");
        int d = str.indexOf("d");
        int e = str.indexOf("e");
        int f = str.indexOf("f");
        int g = str.indexOf("g");
        int h = str.indexOf("h");
        int i = str.indexOf("i");
        int j = str.indexOf("j");
        int k = str.indexOf("k");
        int l = str.indexOf("l");
        int m = str.indexOf("m");
        int n = str.indexOf("n");
        int o = str.indexOf("o");
        int p = str.indexOf("p");
        int q = str.indexOf("q");
        int r = str.indexOf("r");
        int s = str.indexOf("s");
        int t = str.indexOf("t");
        int u = str.indexOf("u");
        int v = str.indexOf("v");
        int w = str.indexOf("w");
        int x = str.indexOf("x");
        int y = str.indexOf("y");
        int z = str.indexOf("z");

        System.out.println(" a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z");
        System.out.println("*******************************************************************************");
        System.out.println(a + "  " + b + "  " + c + "  " + d + "  " +
                e + "  " + f + "  " + g + "  " + h + "  " +
                i + "  " + j + "  " + k + "  " + l + "  " + m + "  " + n + "  " +
                o + "  " + p + "  " + q + "  " + r + "  " +
                s + "  " + t + "  " + u + "  " + v + "  " + w + "  " + x + "  " +
                y + "  " + z);

    }

    //24
    public static String replaceString(String str) {
        String replace = str.replace('d', 'f');
        return replace;
    }

    //26
    public static boolean checkStartsWith(String str, String startsWith) {
        return str.startsWith(startsWith);
    }

    //27
    public static String substring(String str, int firstIndex, int lastIndex) {
        return str.substring(firstIndex, lastIndex);
    }

    //38
    public static String removeDuplicateChars(String str) {
        char[] arr1 = str.toCharArray();
        String removedString = "";
        for (char value : arr1) {
            if (removedString.indexOf(value) == -1) {
                removedString += value;
            }
        }
        return removedString;
    }

    //44
    public static void reversedString(String str) {
        for (int i = str.length() - 1; i >= 0; i--)  {
            System.out.print(str.charAt(i));
        }
    }


    //91
    public static int endWithmOrn(String str) {
        int ctr = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'm' || str.charAt(i) == 'n') {
                ctr++;
            }
        }
        return ctr;
    }

}
