package application;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Day12_JavaCurrencyFormatter {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en", "IN");//Creates a new Locale with English as the language and India as teh country
        
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
