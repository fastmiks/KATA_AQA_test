import java.lang.Integer;
import java.util.regex.Pattern;

class Validate {
    public void validateExpression(String[] splitInput) throws IllegalArgumentException {
        // CHECK EXPRESSION: TWO OPERANDS, ONE OPERATOR
        if (splitInput.length > 3) {
            throw new IllegalArgumentException("the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)");
        } else if (splitInput.length < 3) {
            throw new IllegalArgumentException("Not a mathematical expression");
        }

        // CHECK IF OPERANDS ARE THE WHOLE NUMBER
        String operand1 = splitInput[0];
        String operand2 = splitInput[2];


        Pattern pattern = Pattern.compile("^\\d+$");
        try {
            double checkIfWeHaveNumber = Double.parseDouble(operand1.replace(",", ".")) + Double.parseDouble(operand2.replace(",", "."));
            if (!pattern.matcher(operand1).matches() || !pattern.matcher(operand2).matches()) {
                throw new IllegalArgumentException("Only whole numbers are allowed");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Please enter numbers instead of characters for calculator to work");
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