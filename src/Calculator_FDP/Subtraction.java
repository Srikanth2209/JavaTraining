package Calculator_FDP;

import java.util.Scanner;

class Subtraction implements Operation {

    public void calculate(Scanner scannerObject) {
        int numberOfInputs;
        float[] validInputArray;
        float result = 0;
        try {
            do {
                System.out.print("How many numbers are you going to subtract? ");
                numberOfInputs = scannerObject.nextInt();
            } while (numberOfInputs == 0);

            System.out.print("Enter the Numbers: ");
            validInputArray = new float[numberOfInputs];
            for (int index = 0; index < numberOfInputs; index++) {
                validInputArray[index] = scannerObject.nextFloat();
            }
            for (int indexOfVal = 0; indexOfVal < validInputArray.length; indexOfVal++) {
                if (indexOfVal == 0) {
                    result = validInputArray[indexOfVal];
                } else {
                    result -= validInputArray[indexOfVal];
                }
            }
            System.out.println("Subtraction Result:" + result);
        } catch (NumberFormatException ex) {
            System.out.println("Oops!! please give a valid number");
        }
    }
}
