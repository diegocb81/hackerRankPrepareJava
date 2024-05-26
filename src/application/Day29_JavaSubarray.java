package application;

import java.util.Scanner;

public class Day29_JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
