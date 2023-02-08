# KATA_AQA_test
Test assignment for KATA AQA course

Stage 3. TEST TASK "CALCULATOR"

Description
Create a console application "Calculator". The application must read from the console the strings entered by the user, numbers, arithmetic operations performed between them and output the result of their execution to the console.

Implement the Main class with the public static String calc(String input) method. The method should take a string with an arithmetic expression between two numbers and return a string with the result of their execution. You can add your own imports, classes and methods. Added classes should not have access modifiers (public or others).

Requirements:
The calculator can perform addition, subtraction, multiplication and division operations with two numbers: a + b, a - b, a * b, a / b. 
Data is transmitted in one line (see example)! Solutions in which every number and arithmetic operation is passed from a new line are considered incorrect.
The calculator can only work with Arabic numbers (1,2,3,4,5...).
The calculator must accept numbers from 1 to 10 inclusive, no more. At the output, the numbers are not limited in magnitude and can be any.
The calculator can only work with integers.
When the user enters unsuitable numbers, the application throws an exception and terminates its work.
When the user enters a string that does not correspond to one of the arithmetic operations described above, the application throws an exception and terminates its work.
The result of the division operation is an integer, the remainder is discarded.
The result of the calculator can be negative numbers and zero.



Example of how the program works:

Input:
1 + 2

Output:
3

Input:
1

Output:
throws Exception //because the string is not a mathematical operation

Input:
1 + 2 + 3

Output:
throws Exception //because the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)

Recommendations:
If a large piece of code does not work, try to fix it in parts. Mentally go through the code sequentially, writing down the values of variables and the result of the work. The debug mode is also provided for debugging the application and finding problem areas in the development environment. Video showing the basics of using debug mode in IntelliJ Idea - watch

Try to break a large task into small subtasks and solve them separately - it's much easier this way. Or simplify the task to an option that you can solve, and then refine it to the necessary requirements.
