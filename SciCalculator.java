import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args) {
        Scanner operation = new Scanner(System.in);
        {
            //Defining Variables
            int operater = 0;
            double x;
            int count = 0;
            double y;
            int operator;
            double answer = 0;
            double number = 0;
            boolean exit = false;
            double average = 0;
            boolean jump = true;
            System.out.print("Current Result: " + number + "\n"); // hellp

            while (!exit){
                count++;
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average\n");
                jump = true;
             while(jump) {


                 jump = false;
                 System.out.print("Enter Menu Selection: ");
                 operator = (int) operation.nextDouble();


                 if (operator == 1) {
                     System.out.print("\n");
                     System.out.print("Enter first operand: ");
                     x = operation.nextDouble();
                     System.out.print("Enter second operand: ");
                     y = operation.nextDouble();
                     System.out.print("\n");
                     answer = x + y;
                     System.out.println("Current Result: " + answer + "");
                     System.out.print("\n");

                 } else if (operator == 2) {
                     System.out.print("\n");
                     System.out.print("Enter first operand: ");
                     x = operation.nextDouble();
                     System.out.print("Enter second operand: ");
                     y = operation.nextDouble();
                     System.out.print("\n");
                     answer = x - y;
                     System.out.println("Current Result: " + answer + "");
                     System.out.print("\n");

                 } else if (operator == 3) {
                     System.out.print("\n");
                     System.out.print("Enter first operand: ");
                     x = operation.nextDouble();
                     System.out.print("Enter second operand: ");
                     y = operation.nextDouble();
                     System.out.print("\n");
                     answer = x * y;
                     System.out.println("Current Result: " + answer + "");
                     System.out.print("\n");

                 } else if (operator == 4) {
                     System.out.print("\n");
                     System.out.print("Enter first operand: ");
                     x = operation.nextDouble();
                     System.out.print("Enter second operand: ");
                     y = operation.nextDouble();
                     System.out.print("\n");
                     answer = x / y;
                     System.out.println("Current Result: " + answer + "");
                     System.out.print("\n");

                 } else if (operator == 5) {
                     System.out.print("\n");
                     System.out.print("Enter first operand: ");
                     x = operation.nextDouble();
                     System.out.print("Enter second operand: ");
                     y = operation.nextDouble();
                     System.out.print("\n");
                     answer = Math.pow(x, y);
                     System.out.println("Current Result: " + answer + "");
                     System.out.print("\n");

                 } else if (operator == 6) {
                     System.out.print("\n");
                     System.out.print("Enter first operand: ");
                     x = operation.nextDouble();
                     System.out.print("Enter second operand: ");
                     y = operation.nextDouble();
                     System.out.print("\n");
                     answer = Math.log(y) / Math.log(x);
                     System.out.println("Current Result: " + answer + "");
                     System.out.print("\n");

                 }


                 number = answer + number;

                 average = number / count;

                 average = Math.round(average * 100.0) / 100.0;

                 if (operator == 7) {
                     {
                         if (count == 1)
                             System.out.println("Error: No calculations yet to average!");
                         jump = true;
                     }

                     if (count > 1) {
                         System.out.println("Sum of calculations: " + number + "");
                         System.out.println("Number of calculations: " + (count - 1) + "");
                         System.out.println("Average of calculations:" + average + "");
                         exit = true;
                     }

                 }

                 if (operator == 0) {
                     System.out.println("Thanks for using this calculator. Goodbye!");
                     exit = true;


                 } else if (operator < 0) {
                     System.out.println("Error: Invalid selection!");
                     jump = true;
                 } else if (operator > 7) {
                     System.out.println("Error: Invalid selection!");
                     jump = true;
                 }
             }
            }
        }


    }

}