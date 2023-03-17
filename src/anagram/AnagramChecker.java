package anagram;
import java.util.Arrays;
public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }


        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1)); // true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2)); // false
    }
}

