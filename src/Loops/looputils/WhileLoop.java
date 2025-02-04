package Loops.looputils;

public class WhileLoop {
    public static void stringWhileLoop(String input) {
        int i = 0;
        while (i < input.length()) {
            System.out.println(i + ": " + input.charAt(i));
            i++;
        }
        System.out.println();
    }
}