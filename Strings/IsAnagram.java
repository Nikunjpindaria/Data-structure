// Strings/IsAnagram.java

import java.util.Arrays;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println("Is Anagram: " + isAnagram(s, t)); // Output: true
    }
}
