package Calculator;

public class Student {

    public static void main(String[] args) {
        Calculator operation = new Calculator(new AddOperator());
        operation.Calculate(20, 10);

        operation = new Calculator(new SubtractOperator());
        operation.Calculate(20, 10);

        operation = new Calculator(new MultiplicationOperator());
        operation.Calculate(20, 10);

        operation = new Calculator(new DivisionOperator());
        operation.Calculate(20, 10);
    }
}
