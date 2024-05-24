package application;

import java.math.BigInteger;
import java.util.Scanner;

public class Day26_JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberA = scanner.nextLine();
        String numberB = scanner.nextLine();
        BigInteger bigNumberA = new BigInteger(numberA);
        BigInteger bigNumberB = new BigInteger(numberB);
        System.out.println(bigNumberA.add(bigNumberB));
        System.out.println(bigNumberA.multiply(bigNumberB));
        scanner.close();
    }
}
