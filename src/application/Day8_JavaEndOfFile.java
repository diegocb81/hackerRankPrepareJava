package application;

import java.util.Scanner;

public class Day8_JavaEndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (input.hasNextLine()) {
            String str = input.nextLine();
                if (str.contains("end-of-file")) {
                    i++;
                    System.out.println(i + " " + str);
                    break;
                } else {
                    i++;
                    System.out.println(i + " " + str);
                }
        }
        input.close();
    }
}
