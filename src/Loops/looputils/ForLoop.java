package Loops.looputils;

public class ForLoop {
    public static void stringForLoop(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(i + ": " + input.charAt(i));
        }
        System.out.println();
    }
}
