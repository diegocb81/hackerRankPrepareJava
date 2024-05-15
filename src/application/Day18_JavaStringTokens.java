package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day18_JavaStringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            System.out.println(0);
        } else {
            String input = sc.nextLine();
            String[]a = input.trim().split("[ !,?._'@]+");
            ArrayList<String>listOfStrings = new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());

            for(String str : listOfStrings) {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
