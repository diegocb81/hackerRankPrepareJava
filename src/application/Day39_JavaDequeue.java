package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day39_JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  
        int m = in.nextInt();  
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxUnique = 0;
        
        for (int i = 0; i < m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        maxUnique = map.size();
        
        for (int i = m; i < n; i++) {
            int elementOut = arr[i - m];
            map.put(elementOut, map.get(elementOut) - 1);
            if (map.get(elementOut) == 0) {
                map.remove(elementOut);
            }
            
            int elementIn = arr[i];
            map.put(elementIn, map.getOrDefault(elementIn, 0) + 1);
            
            maxUnique = Math.max(maxUnique, map.size());
        }       
        System.out.println(maxUnique);
    }
}
