class Calculate {
    public int calculateResult(String[] splitInput) {
        int num1 = Integer.parseInt(splitInput[0]);
        int num2 = Integer.parseInt(splitInput[2]);
        char operator = splitInput[1].charAt(0);
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}