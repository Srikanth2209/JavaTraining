package Calculator;

public class DivisionOperator implements IOperator {
    @Override
    public void executeOperation(int a, int b) {
        System.out.println("DivisionOperator result : " + (a / b));

    }
}