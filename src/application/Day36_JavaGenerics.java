package application;

import java.lang.reflect.Method;

class Printer {
    public static <E> void printArray(E[] inputArray) {
        for ( E element : inputArray ){        
            System.out.println(element);
        }
    }
}

public class Day36_JavaGenerics {
    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        Printer.printArray(intArray);  
        Printer.printArray(stringArray);

        int count = 0;
        Method[] methods = Printer.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("printArray")) {
                count++;
                if (count > 1) {
                    break;  
                }
            }
        }
        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
    }
}
