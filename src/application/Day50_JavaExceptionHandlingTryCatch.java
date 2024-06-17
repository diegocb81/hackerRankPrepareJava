package application;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Day50_JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
        scan.close();
    }
}
