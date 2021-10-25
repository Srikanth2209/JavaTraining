package Calculator_FDP;

import java.util.Scanner;

class Division implements Operation {
    @Override
    public void calculate(Scanner scannerObject) {
        float dividend, divisor;
        float result;
        try {
            System.out.print("Enter a Dividend : ");
            dividend = scannerObject.nextFloat();
            System.out.print("Enter a Divisor : ");
            divisor = scannerObject.nextFloat();
            result = dividend / divisor;
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException occurs!! ");
        } catch (NumberFormatException exception) {
            System.out.println("Oops!! please give a valid number");
        }
    }
}
