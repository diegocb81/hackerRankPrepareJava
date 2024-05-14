package application;

import java.util.Arrays;
import java.util.Scanner;

public class Day17_JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        boolean f = false;
        char[] c = a.toCharArray();
        Arrays.sort(c);
        char[] d = b.toCharArray();
        Arrays.sort(d);
        String A = new String(c);
        String B = new String(d);

        if (A.equals(B)) {
            f = true;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
