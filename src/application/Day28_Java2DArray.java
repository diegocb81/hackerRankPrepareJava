package application;

import java.util.Scanner;

public class Day28_Java2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i = 0; arr_i < 6; arr_i++) {
            for(int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = scanner.nextInt();
            }
        }
        scanner.close();
        Sum(arr);
    }

    private static void Sum(int arr[][]) {
        int sum = -1000;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                int top = arr[x][y] + arr[x][y+1] + arr[x][y+2];
                int middle = arr[x+1][y+1];
                int bottom = arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
                if (top + middle + bottom > sum) {
                    sum = top + middle + bottom;
                }
            }
        }
        System.out.println(sum);
    }
}
