import java.lang.Integer;
import static org.codehaus.groovy.runtime.StringGroovyMethods.isNumber;

class Validate {
    public void validateExpression(String[] splitInput) throws IllegalArgumentException {
        // CHECK EXPRESSION: TWO OPERANDS, ONE OPERATOR
        if (splitInput.length != 3) {
            throw new IllegalArgumentException("the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)");
        }

        // CHECK TWO OPERANDS ARE NUMBERS
        if (!isNumber(splitInput[0]) || !isNumber(splitInput[2])) {
            throw new IllegalArgumentException("This is not a mathematical expression");
        }

        // CHECK TWO OPERANDS ARE NUMBERS FROM 1 TO 10
        int num1 = Integer.parseInt(splitInput[0]);
        int num2 = Integer.parseInt(splitInput[2]);
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new IllegalArgumentException("Please enter a number between 1 and 10 inclusive");
        }

        // CHECK OPERATOR MATCHES ONE OF + - * /
        if (!splitInput[1].equals("+") && !splitInput[1].equals("-") && !splitInput[1].equals("*") && !splitInput[1].equals("/")) {
            throw new IllegalArgumentException("Invalid operator, please use one of (+, -, *, /)");
        }
    }
}