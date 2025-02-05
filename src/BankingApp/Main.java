package BankingApp;

import java.util.Scanner;
import java.util.logging.*;
import java.io.*;
import Math.mathutils.Add;
import Math.mathutils.Sub;
import Math.mathutils.Mul;
import Math.mathutils.Div;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String commands = "src/BankingApp/commands.txt";
        double balance = 100.00;

        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (command.equalsIgnoreCase("e")) {
                System.out.println("Goodbye!");
                break;
            }

            if (command.equalsIgnoreCase("help")) {
                System.out.println("Commands:");
                try (BufferedReader br = new BufferedReader(new FileReader(commands))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
