package Calculator_FDP;

import java.util.Scanner;

class Multiplication implements Operation {
    @Override
    public void calculate(Scanner scannerObject) {
        int numberOfInputs;
        float[] validInputArray;
        float result = 1;
        try {
            do {
                System.out.print("How many numbers are you going to multiply? ");
                numberOfInputs = scannerObject.nextInt();
            } while (numberOfInputs == 0);

            System.out.print("Enter the Numbers: ");
            validInputArray = new float[numberOfInputs];
            for (int index = 0; index < numberOfInputs; index++) {
                validInputArray[index] = scannerObject.nextFloat();
            }

            for (float value : validInputArray) {
                result = result * value;
            }
            System.out.println("Multiplication Result: " + result);
        }
        catch(NumberFormatException exception)
        {
            System.out.println("Oops!! please give a valid number");
        }
    }
}