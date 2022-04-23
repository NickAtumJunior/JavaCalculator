import java.util.Scanner;

public class Calculator {
    static double addition(double x, double y) {
        return x + y;
    }

    static double subraction(double x, double y) {
        return x - y;
    }

    static double multiplication(double x, double y) {
        return x * y;
    }

    static double division(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of x ? ");
        double x = scanner.nextDouble();
        System.out.println("what is the value of y ? ");
        double y = scanner.nextDouble();

        System.out.println(
                "which operation you want to do ? Note: Please Enter like this \n 1.multiply \n 2.division \n 3.subraction \n 4.addition");
        String dumb = scanner.next();

        if (dumb.contains("multiply")) {
            System.out.println(multiplication(x, y));
        } else if (dumb.contains("division")) {
            System.out.println(division(x, y));
        } else if (dumb.contains("subraction")) {
            System.out.println(subraction(x, y));
        } else if (dumb.contains("addition")) {
            System.out.println(addition(x, y));
        }
    }
}
