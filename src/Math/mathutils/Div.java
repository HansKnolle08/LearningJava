package Math.mathutils;

public class Div {
    public static double div(double a, double b) {
        if (a == 0.0 || b == 0.0) {
            System.out.println("Division by zero");
            return 0;
        } else {
            return a / b;
        }
    }

    public static double div(int a, double b) {
        if (a == 0 || b == 0.0) {
            System.out.println("Division by zero");
            return 0;
        } else {
            return a / b;
        }
    }

    public static double div(double a, int b) {
        if (a == 0.0 || b == 0) {
            System.out.println("Division by zero");
            return 0;
        } else {
            return a / b;
        }
    }

    public static double div(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Division by zero");
            return 0;
        } else {
            return (double) a / b;
        }
    }

}
