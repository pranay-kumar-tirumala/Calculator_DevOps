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
                case 2: // finding natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    System.out.println("\n");
                    break;
                case 3: // finding factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    System.out.println("\n");
                    break;
                case 4: // finding power ,i.e, x^y
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1,number2));
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
    public double factorial(double number)
    {
        logger.info("[FACTORIAL] - " + number);
        double result = fact(number);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public double naturalLog(double number)
    {
        logger.info("[NATURAL LOG] - " + number);
        double result = 0;
        try
        {
            if (number<0)
            {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
             else
                result = Math.log(number);
        }
        catch (ArithmeticException error)
        {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double fact(double number)
    {
        double factorial = 1;
        for(int i = 1; i <= number; ++i)
            factorial *= i;
        return  factorial;
    }
    public double power(double number1, double number2)
    {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
}
