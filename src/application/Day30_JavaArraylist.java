package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day30_JavaArraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leitura dos dados e armazenamento em listas aninhadas
        List<List<Integer>> lines = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            List<Integer> line = new ArrayList<>(d);
            for (int j = 0; j < d; j++) {
                line.add(in.nextInt());
            }
            lines.add(line);
        }

        // Processamento das consultas
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                // Ajuste de índices para zero-based
                System.out.println(lines.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        in.close();
    }
}
