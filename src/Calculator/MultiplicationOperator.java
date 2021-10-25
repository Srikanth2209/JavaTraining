package Calculator;

public class MultiplicationOperator implements IOperator {
    @Override
    public void executeOperation(int a, int b) {
        System.out.println("MultiplicationOperator result : " + (a * b));
    }
}
