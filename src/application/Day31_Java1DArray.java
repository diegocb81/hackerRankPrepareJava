package application;

import java.util.Scanner;

public class Day31_Java1DArray {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return canWinFromPosition(leap, game, 0, new boolean[game.length]);
    }
    
    private static boolean canWinFromPosition(int leap, int[] game, int position, boolean[] visited) {
        // Base cases
        if (position >= game.length) {
            return true;
        }
        if (position < 0 || game[position] == 1 || visited[position]) {
            return false;
        }

        // Mark the current position as visited
        visited[position] = true;

        // Recursively check if it's possible to win from this position
        return canWinFromPosition(leap, game, position + leap, visited) || 
               canWinFromPosition(leap, game, position + 1, visited) || 
               canWinFromPosition(leap, game, position - 1, visited);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
