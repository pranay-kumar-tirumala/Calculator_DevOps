package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator()
    {
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do
            {
            System.out.println("Welcome to DevOps Calculator !!!");
            System.out.print("Press 1 to find Square root \nPress 2 to find natural logarithm\nPress 3 to find factorial\nPress 4 to find power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try
            {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException error)
            {
                return;
            }
            switch (choice)
            {
                case 1: // finding square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.squareroot(number1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
        } while (true);
    }
    
    public double squareroot(double number)
    {
        logger.info("[SQ ROOT] - " + number);
        double result = Math.sqrt(number);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
}
