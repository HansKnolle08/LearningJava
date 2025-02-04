package CalculatorWithCLI;

import java.util.Scanner;
import Math .mathutils.Add;
import Math.mathutils.Sub;
import Math .mathutils.Mul;
import Math.mathutils.Div;

public class Main {

    public static String  showCommands() {
        return (
                """
                        exit: Beendet das Programm
                        help: Zeigt die Befehlsliste
                        add: Addiert zwei Zahlen
                        sub: Subtrahiert zwei Zahlen
                        mul: Multipliziert zwei Zahlen
                        div: Dividiert zwei Zahlen
                        """
                );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte gebe ein was du machen möchtest:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Beende Programm...");
                break;
            }

            if (input.equalsIgnoreCase("help")) {
                System.out.println(showCommands());
            }

            if (input.equalsIgnoreCase("add")) {
                try {
                    System.out.println("Bitte gib die erste Zahl ein:");
                    double zahl1 = scanner.nextDouble();
                    System.out.println("Bitte gib die nächste Zahl ein:");
                    double zahl2 = scanner.nextDouble();
                    double result = Add.add(zahl1, zahl2);
                    System.out.println("Das Ergebnis ist: " + result);
                } catch (Exception e) {
                    System.out.println("Bitte gebe eine Zahl ein.");
                }
            }

            if (input.equalsIgnoreCase("sub")) {
                try {
                    System.out.println("Bitte gib die erste Zahl ein:");
                    double zahl1 = scanner.nextDouble();
                    System.out.println("Bitte gib die nächste Zahl ein:");
                    double zahl2 = scanner.nextDouble();
                    double result = Sub.sub(zahl1, zahl2);
                    System.out.println("Das Ergebnis ist: " + result);
                } catch (Exception e) {
                    System.out.println("Bitte gebe eine Zahl ein.");
                }
            }

            if (input.equalsIgnoreCase("mul")) {
                try {
                    System.out.println("Bitte gib die erste Zahl ein:");
                    double zahl1 = scanner.nextDouble();
                    System.out.println("Bitte gib die nächste Zahl ein:");
                    double zahl2 = scanner.nextDouble();
                    double result = Mul.mul(zahl1, zahl2);
                    System.out.println("Das Ergebnis ist: " + result);
                } catch (Exception e) {
                    System.out.println("Bitte gebe eine Zahl ein.");
                }
            }

            if (input.equalsIgnoreCase("div")) {
                try {
                    System.out.println("Bitte gib die erste Zahl ein:");
                    double zahl1 = scanner.nextDouble();
                    System.out.println("Bitte gib die nächste Zahl ein:");
                    double zahl2 = scanner.nextDouble();
                    double result = Div.div(zahl1, zahl2);
                    System.out.println("Das Ergebnis ist: " + result);
                } catch (Exception e) {
                    System.out.println("Bitte gebe eine Zahl ein.");
                }
            }
        }
    }
}
