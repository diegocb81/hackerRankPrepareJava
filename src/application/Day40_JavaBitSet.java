package application;

import java.util.BitSet;
import java.util.Scanner;

public class Day40_JavaBitSet {
    public static void main(String[] args) {
        // Uso de Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // Leitura de n e m
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Inicialização de dois BitSets com capacidade n
        BitSet[] bits = {new BitSet(n), new BitSet(n)};
        
        for (int i = 0; i < m; i++) {
            // Leitura da operação e índices
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Ajuste do índice para 0-based
            int setIndex = x - 1;
            int secondIndex = y - 1;
            
            // Realiza a operação com base na entrada
            switch (operation) {
                case "AND":
                    bits[setIndex].and(bits[secondIndex]);
                    break;
                case "OR":
                    bits[setIndex].or(bits[secondIndex]);
                    break;
                case "XOR":
                    bits[setIndex].xor(bits[secondIndex]);
                    break;
                case "FLIP":
                    bits[setIndex].flip(secondIndex);
                    break;
                case "SET":
                    bits[setIndex].set(secondIndex);
                    break;
                default:
                    break;
            }
            // Impressão das cardinalidades dos dois BitSets
            System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
        }
        sc.close();
    }
}
