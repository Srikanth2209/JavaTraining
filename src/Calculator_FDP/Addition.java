package Calculator_FDP;


import java.util.Scanner;

class Addition implements Operation {

    @Override
    public void calculate(Scanner scannerObject) {
        int numberOfInputs;
        float[] validInputArray;
        float result=0;
        try {
            do {
                System.out.print("How many numbers are you going to add? ");
                numberOfInputs = scannerObject.nextInt();
            } while (numberOfInputs == 0);
            System.out.print("Enter the Numbers: ");
            validInputArray = new float[numberOfInputs];
            for (int index = 0; index < numberOfInputs; index++) {
                validInputArray[index] = scannerObject.nextFloat();
            }
            for (float data : validInputArray) {
                result = result + data;
            }
            System.out.println("Addition Result: " + result);
        }
        catch(NumberFormatException exception)
        {
            System.out.println("Oops!! please give a valid number");
        }
    }
}