package Calculator_FDP;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperationDecider operation = new OperationDecider();
        int choiceOfOperation;
        System.out.println("Enter your choice of operation in the form of number: ");
        System.out.println("1--> Addition");
        System.out.println("2--> Subtraction");
        System.out.println("3--> Multiplication");
        System.out.println("4--> Division");
        try {
            choiceOfOperation = scanner.nextInt();
            while (choiceOfOperation == 0 || choiceOfOperation > 4) {
                System.out.println("Disclaimer: Enter your choice from 1 to 4");
                choiceOfOperation = scanner.nextInt();
            }
            Operation run = operation.getOperation(choiceOfOperation);
            run.calculate(scanner);
        } catch (InputMismatchException exception){
            System.out.println("Disclaimer: Enter your choice only in numbers");
        }
    }
}