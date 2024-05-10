package application;

import java.util.Scanner;

public class Day13_JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int len = A.length() + B.length();
        System.out.println(len);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " +
        Character.toUpperCase(B.charAt(0)) + B.substring(1));
        sc.close();
    }
}
