import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arithmetic operations in the format 'a + b' or 'a - b' or 'a * b' or 'a / b'");
        System.out.println("Enter one whitespace between operator and operands!\n\nONLY this expression will work: 'a + b'\nThese expressions will generate an error:  'a+b','a +b', 'a+ b', ' a + b ', 'a + b ', ' a + b'");
        System.out.println("Only numbers from 1 to 10 can be used\n");
        while (true) {
            System.out.println("Enter expression:");
            String expression = input.nextLine();
            String[] splitInput = expression.split(" ");
            Validate validate = new Validate();
            try {
                validate.validateExpression(splitInput);
                Calculate calculate = new Calculate();
                System.out.println(calculate.calculateResult(splitInput));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }
}
