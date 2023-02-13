import java.util.Scanner;

class Calculator {
    public static String calc(String input) {
        String[] splitInput = input.trim().split("\\s+");

        if (splitInput.length != 3) {
            splitInput = input.split("(?<=[+\\-*/])|(?=[+\\-*/])");
        }

        Validate validate = new Validate();

        try {
            validate.validateExpression(splitInput);
            Calculate calculate = new Calculate();
            return Integer.toString(calculate.calculateResult(splitInput));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arithmetic operations in the format 'a + b' or 'a - b' or 'a * b' or 'a / b'");
        System.out.println("Only numbers from 1 to 10 can be used\n");

        while (true) {
            System.out.println("Enter expression:");
            String expression = input.nextLine();
            System.out.println(calc(expression));
        }
    }
}