import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result;
            switch (choice) {
                case 1:
                    result = performAddition();
                    break;
                case 2:
                    result = performSubtraction();
                    break;
                case 3:
                    result = performMultiplication();
                    break;
                case 4:
                    result = performDivision();
                    break;
                case 5:
                    result = performSquareRoot();
                    break;
                case 6:
                    result = performTrigonometricFunction("sine");
                    break;
                case 7:
                    result = performTrigonometricFunction("cosine");
                    break;
                case 8:
                    result = performTrigonometricFunction("tangent");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static double performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        if (denominator == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; 
        }
        return numerator / denominator;
    }

    private static double performSquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }

    private static double performTrigonometricFunction(String functionName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = Math.toRadians(scanner.nextDouble());

        switch (functionName.toLowerCase()) {
            case "sine":
                return Math.sin(angle);
            case "cosine":
                return Math.cos(angle);
            case "tangent":
                return Math.tan(angle);
            default:
                System.out.println("Invalid trigonometric function. Please try again.");
                return Double.NaN;
        }
    }
}
